package com.example.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssProjectClassMapper;
import com.example.bss.pojo.BssProjectClass;
import com.example.bss.pojo.BssProjectClassExample;
import com.example.bss.service.BssProjectClassService;
@Service
public class BssProjectClassServiceImpl implements BssProjectClassService {

	@Autowired
	private BssProjectClassMapper bssProjectClassMapper;

	@Override
	public void insertProjectClass(BssProjectClass bssProjectClass) throws Exception {
		bssProjectClassMapper.insert(bssProjectClass);

	}

	@Override
	public void updateProjectClass(BssProjectClass bssProjectClass) throws Exception {
		bssProjectClassMapper.updateByPrimaryKeySelective(bssProjectClass);
	}

	@Override
	public List<BssProjectClass> findProjectClass(BssProjectClassExample example) throws Exception {
		return bssProjectClassMapper.selectByExample(example);
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssProjectClassMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteOfBatch(List list) throws Exception {
		bssProjectClassMapper.deleteOfbatch(list);
	}

	@Override
	public List<BssProjectClass> findDim(String str) throws Exception {
		return bssProjectClassMapper.findDim(str);
	}

}
