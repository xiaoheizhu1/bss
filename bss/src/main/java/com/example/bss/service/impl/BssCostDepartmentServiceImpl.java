package com.example.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssCostDepartmentMapper;
import com.example.bss.pojo.BssCostDepartment;
import com.example.bss.pojo.BssCostDepartmentExample;
import com.example.bss.service.BssCostDepartmentService;
@Service
public class BssCostDepartmentServiceImpl implements BssCostDepartmentService {

	@Autowired
	private BssCostDepartmentMapper bssCostDepartmentMapper;

	@Override
	public void insertCostDepartment(BssCostDepartment bssCostDepartment) throws Exception {
		bssCostDepartmentMapper.insert(bssCostDepartment);

	}

	@Override
	public void updateCostDepartment(BssCostDepartment bssCostDepartment) throws Exception {
		bssCostDepartmentMapper.updateByPrimaryKeySelective(bssCostDepartment);
	}

	@Override
	public List<BssCostDepartment> findCostDepartment(BssCostDepartmentExample example) throws Exception {
		return bssCostDepartmentMapper.selectByExample(example);
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssCostDepartmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteOfBatch(List list) throws Exception {
		bssCostDepartmentMapper.deleteOfbatch(list);
	}

	@Override
	public List<BssCostDepartment> findDim(String str) throws Exception {
		return bssCostDepartmentMapper.findDim(str);
	}

}
