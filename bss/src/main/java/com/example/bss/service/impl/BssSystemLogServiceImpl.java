package com.example.bss.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssSystemLogMapper;
import com.example.bss.pojo.BssSystemLog;
import com.example.bss.service.BssSystemLogService;

@Service
public class BssSystemLogServiceImpl implements BssSystemLogService {

	@Autowired
	private BssSystemLogMapper bssSystemLogMapper;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式



	@Override
	public void insertSystemLog(String lx, String nr, String username, String ip, String createTime)
			throws Exception {
		BssSystemLog record = new BssSystemLog();
		record.setLx(lx);
		record.setNr(nr);
		record.setUsername(username);
		record.setIp(ip);
		record.setCreateTime(createTime);
		bssSystemLogMapper.insert(record);
	}

	@Override
	public List<BssSystemLog> showSystemLog() throws Exception {
		List<BssSystemLog> systemlogList = bssSystemLogMapper.findAll();
		if (systemlogList.size()==0) {
			throw new Exception("系统日志列表为空");
		}
		return systemlogList;
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssSystemLogMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void deleteOfBatch(List list) throws Exception {
		bssSystemLogMapper.deleteOfbatch(list);
	}

	@Override
	public List<BssSystemLog> findByObjectSystemLog(String str) throws Exception {
		return bssSystemLogMapper.findDim(str);
	}

}
