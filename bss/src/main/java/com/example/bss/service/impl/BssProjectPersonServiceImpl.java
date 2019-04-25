package com.example.bss.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssProjectPersonMapper;
import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.service.BssProjectPersonService;
import com.example.bss.service.BssSystemLogService;

import io.netty.util.internal.StringUtil;

@Service
public class BssProjectPersonServiceImpl implements BssProjectPersonService {

	@Autowired
	private BssProjectPersonMapper bssProjectPersonMapper;
	@Autowired
	private BssSystemLogService bssSystemLogService;

	@Autowired
	private HttpSession session;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式

	@Override
	public Map<String, Object> isNoLogin(Map<String, String> user) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		String username = "";
		String password = "";
		if (user.containsKey("username")) {
			username = user.get("username").toString();
			if (user.containsKey("password")) {
				password = user.get("password").toString();
			}
		}
		List<BssProjectPerson> list = bssProjectPersonMapper.findAll();
		for (int i = 0; i < list.size(); i++) {
			BssProjectPerson one = list.get(i);
			if (username.equals(one.getUsername()) && password.equals(one.getPassword())) {
				String ClientIp = (String) session.getAttribute("ClientIp");
				bssSystemLogService.insertSystemLog("登录", "进行登录", username, ClientIp,
						sdf.format(new Date()).toString());
				result.put("code", "1");
				result.put("BssProjectPersonList", one);
				return result;
			}
		}
		result.put("code", "-1");
		return result;
	}

	@Override
	public Map<String, Object> isNoRegister(Map<String, String> user) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		BssProjectPerson record = new BssProjectPerson();
		if (!StringUtil.isNullOrEmpty(user.get("xm")) && !StringUtil.isNullOrEmpty(user.get("username"))
				&& !StringUtil.isNullOrEmpty(user.get("password"))
				&& !StringUtil.isNullOrEmpty(user.get("qrpassword"))) {
			if (user.get("password").equals(user.get("qrpassword"))) {
				String ClientIp = (String) session.getAttribute("ClientIp");
				bssSystemLogService.insertSystemLog("注册", "进行注册", user.get("username"), ClientIp,
						sdf.format(new Date()).toString());
				record.setXm(user.get("xm"));
				record.setUsername(user.get("username"));
				record.setPassword(user.get("password"));
				if (user.containsKey("phone")) {
					record.setPhone(user.get("phone"));
				}
				if (user.containsKey("email")) {
					record.setEmail(user.get("email"));
				}
				if (user.containsKey("bz")) {
					record.setBz(user.get("bz"));
				}
				record.setCreateTime(sdf.format(new Date()));
				bssProjectPersonMapper.insert(record);
				result.put("code", "1");
				return result;
			} else {
				result.put("code", "-1");
				return result;
			}
		}
		result.put("code", "-2");
		return result;
	}

}
