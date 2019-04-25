package com.example.bss.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssCostDepartmentMapper;
import com.example.bss.dao.BssProjectClassMapper;
import com.example.bss.dao.BssProjectInfoMapper;
import com.example.bss.dao.BssProjectPersonMapper;
import com.example.bss.dao.BssProjectPriceMapper;
import com.example.bss.dao.BssSupplierMapper;
import com.example.bss.pojo.BssCostDepartment;
import com.example.bss.pojo.BssCostDepartmentExample;
import com.example.bss.pojo.BssProjectClass;
import com.example.bss.pojo.BssProjectClassExample;
import com.example.bss.pojo.BssProjectInfo;
import com.example.bss.pojo.BssProjectInfoExample;
import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.pojo.BssProjectPersonExample;
import com.example.bss.pojo.BssProjectPrice;
import com.example.bss.pojo.BssSupplier;
import com.example.bss.pojo.BssSupplierExample;
import com.example.bss.service.BssProjectInfoService;

import io.netty.util.internal.StringUtil;

@Service
public class BssProjectInfoServiceImpl implements BssProjectInfoService {

	@Autowired
	private BssProjectInfoMapper bssProjectInfoMapper;
	@Autowired
	private BssProjectPersonMapper bssProjectPersonMapper;
	@Autowired
	private BssProjectClassMapper bssProjectClassMapper;
	@Autowired
	private BssCostDepartmentMapper bssCostDepartmentMapper;
	@Autowired
	private BssProjectPriceMapper bssProjectPriceMapper;
	@Autowired
	private BssSupplierMapper bssSupplierMapper;
	@Autowired
	private HttpSession session;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
	protected static final Logger logger = LoggerFactory.getLogger(BssProjectInfoServiceImpl.class);

	@Override
	public void insertProjectInfo(BssProjectInfo bssProjectInfo) throws Exception {
		bssProjectInfoMapper.insert(bssProjectInfo);

	}

	@Override
	public void updateProjectInfo(BssProjectInfo bssProjectInfo) throws Exception {
		bssProjectInfoMapper.updateByPrimaryKeySelective(bssProjectInfo);
	}

	@Override
	public List<BssProjectInfo> findProjectInfo(BssProjectInfoExample example) throws Exception {
		return bssProjectInfoMapper.selectByExample(example);
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssProjectInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Map<String, Object> deleteOfBatch(List list) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<BssProjectPrice> projectIdObject = bssProjectPriceMapper.selectProject_idList(list);
		if (projectIdObject.size() == 0) {
			bssProjectInfoMapper.deleteOfbatch(list);
			resultMap.put("code", "1");
		} else {
			List<Integer> ProjectIdlist = new ArrayList<Integer>();
			for (BssProjectPrice bssProjectPrice : projectIdObject) {
				ProjectIdlist.add(bssProjectPrice.getProjectId());
			}
			resultMap.put("projectIdList", ProjectIdlist);
			resultMap.put("code", "-1");
		}
		return resultMap;
	}

	@Override
	public List<BssProjectInfo> findDim(String str) throws Exception {
		return bssProjectInfoMapper.findDim(str);
	}

	@Override
	public HashMap<String, Object> selectJoinList() throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		BssProjectPersonExample personExample = new BssProjectPersonExample();
		BssProjectClassExample classExample = new BssProjectClassExample();
		BssCostDepartmentExample costDepartmentExample = new BssCostDepartmentExample();
		BssSupplierExample supplierExample = new BssSupplierExample();

		List<BssProjectPerson> personList = bssProjectPersonMapper.selectByExample(personExample);
		List<BssProjectClass> classList = bssProjectClassMapper.selectByExample(classExample);
		List<BssCostDepartment> departemntList = bssCostDepartmentMapper.selectByExample(costDepartmentExample);
		List<BssSupplier> supplierList = bssSupplierMapper.selectByExample(supplierExample);

		map.put("personList", personList);
		map.put("classList", classList);
		map.put("departemntList", departemntList);
		map.put("supplierList", supplierList);
		return map;
	}

	/**
	 * flag参数：1新增 2修改 3草稿
	 */
	@Override
	public Map<String, Object> saveProjectInfo(Map<String, String> info, String flag) throws Exception {
		int projectId = (Integer) session.getAttribute("projectId");
		Map<String, Object> map = new HashMap<String, Object>();
		if (info.get("xmlx") == null || info.get("xmmc") == null || info.get("ssd") == null || info.get("fzr") == null
				|| info.get("cwkmgl") == null || info.get("sflx") == null || info.get("xmfl") == null
				|| info.get("fygsbm") == null || info.get("qdx") == null) {
			map.put("code", "-1");
			map.put("message", "必输项不能为空!");
			return map;
		}
		BssProjectInfo record = new BssProjectInfo();
		record.setXmlx(info.get("xmlx"));// 项目类型
		record.setXmmc(info.get("xmmc"));// 项目名称
		record.setXmsm(info.get("xmsm"));// 项目说明
		record.setSsd(info.get("ssd"));// 所属地
		record.setFzr(!StringUtil.isNullOrEmpty(info.get("fzr")) ? Integer.valueOf(info.get("fzr")) : null);// 负责人
		record.setCwkmgl(info.get("cwkmgl"));// 财务科目归类
		record.setSflx(info.get("sflx"));// 是否立项
		record.setXmfl(!StringUtil.isNullOrEmpty(info.get("xmfl")) ? Integer.valueOf(info.get("xmfl")) : null);// 项目分类
		record.setFygsbm(!StringUtil.isNullOrEmpty(info.get("fygsbm")) ? Integer.valueOf(info.get("fygsbm")) : null);// 费用归属部门
		record.setQdx(info.get("sx"));// 属性
		record.setQdx(info.get("qdx"));// 确定性
		record.setGys(!StringUtil.isNullOrEmpty(info.get("gysmc")) ? Integer.valueOf(info.get("gysmc")) : null);// 供应商
		record.setDyyw(info.get("dyyw"));// 对应业务
		record.setByyxj(info.get("byyxj"));// 必要优先级
		record.setDyywbk(info.get("dyywbk"));// 对应业务板块
		record.setZcfs(info.get("zcfs"));// 支出方式 (0:资本性支出 1:费用性支出)
		record.setItjsfy(info.get("itjsfy"));// IT建设费用
		record.setItywcb(info.get("itywcb"));// IT运维成本
		record.setWnysyzjnys(info.get("wnysyzjnys"));// 往年预算移至今年预算
		record.setCxywkzys(info.get("cxywkzys"));// 创新业务拓展预算
		record.setGdgxzc(info.get("gdgxzc"));// 固定刚性支出
		record.setZlywzz(info.get("zlywzz"));// 助力业务增长
		record.setTsxl(info.get("tsxl"));// 提升效率
		record.setXmsx(info.get("xmsx"));// 项目属性
		record.setCxky(info.get("cxky"));// 创新科研
		record.setQtxm(info.get("qtxm"));// 其他项目
		record.setZys(info.get("zys"));// 2019年总预算
		record.setBz(info.get("bz"));// 备注
		if ("1".equals(flag)) {
			record.setStatus("1");// 1正常 2草稿
		} else if ("3".equals(flag)) {
			record.setStatus("2");// 1正常 2草稿
		}
		if ("2".equals(flag)) {
			record.setId(projectId);
			record.setUpdateTime(sdf.format(new Date()).toString());// 修改时间
			bssProjectInfoMapper.updateByPrimaryKeySelective(record);
		} else {
			record.setCreateTime(sdf.format(new Date()).toString());// 创建时间
			bssProjectInfoMapper.insertSelective(record);
		}
		int infoId = record.getId();
		if (!StringUtil.isNullOrEmpty(info.get("dj"))) {
			BssProjectPrice price = new BssProjectPrice();
			price.setDj(info.get("dj"));// 单价
			price.setSl(info.get("sl"));// 数量
			price.setZysje(info.get("zysje"));// 总预算金额
			price.setXz19(info.get("xz19"));// 19年新增
			price.setDy18(info.get("dy18"));// 18年递延
			price.setYzf(info.get("yzf"));// 已支付
			price.setBz(info.get("bz"));// 备注
			if ("1".equals(flag)) {
				price.setStatus("1");// 1正常 2草稿
			} else if ("3".equals(flag)) {
				price.setStatus("2");// 1正常 2草稿
			}
			if ("2".equals(flag)) {
				BssProjectPrice bs = bssProjectPriceMapper.selectProject_id(projectId);
				if (bs != null) {
					price.setId(bs.getId());
					price.setUpdateTime(sdf.format(new Date()).toString());
					bssProjectPriceMapper.updateByPrimaryKeySelective(price);
				} else {
					price.setProjectId(infoId);// 所在项目id
					price.setCreateTime(sdf.format(new Date()).toString());// 创建时间
					bssProjectPriceMapper.insertSelective(price);
				}
			} else {
				if (infoId != 0) {
					price.setProjectId(infoId);// 所在项目id
					price.setCreateTime(sdf.format(new Date()).toString());// 创建时间
					bssProjectPriceMapper.insertSelective(price);
				} else {
					map.put("code", "-1");
					map.put("message", "单价信息保存失败! 无法获取到项目信息ID!");
				}
			}
		}
		map.put("code", "1");
		return map;
	}

	@Override
	public HashMap<String, Object> selectProjectInfoJoinAll(Integer projectid) throws Exception {
		HashMap<String, Object> resutlmap = new HashMap<String, Object>();
		List<HashMap<String, Object>> resutlList = bssProjectInfoMapper.selectProjectInfoJoinAll(projectid);
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();	
		for (HashMap<String, Object> hashMap : resutlList) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			for (String keys : hashMap.keySet()) {	
				Object obj = hashMap.get(keys);
				if (null==obj||("").equals(obj)||("(NULL)".equals(obj))) {
				    String values = "";
					map.put(keys, values);
				}else {
				   map.put(keys, obj);
				}
		    }
			list.add(map);
		}	
		resutlmap.put("resutlList", list);
		return resutlmap;
	}

}
