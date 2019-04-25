package com.example.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssSupplierMapper;
import com.example.bss.pojo.BssSupplier;
import com.example.bss.pojo.BssSupplierExample;
import com.example.bss.service.BssSupplierService;
@Service
public class BssSupplierServiceImpl implements BssSupplierService {

	@Autowired
	private BssSupplierMapper bssSupplierMapper;

	@Override
	public void insertSupplier(BssSupplier bssSupplier) throws Exception {
		bssSupplierMapper.insert(bssSupplier);

	}

	@Override
	public void updateSupplier(BssSupplier bssSupplier) throws Exception {
		bssSupplierMapper.updateByPrimaryKeySelective(bssSupplier);
	}

	@Override
	public List<BssSupplier> findSupplier(BssSupplierExample example) throws Exception {
		return bssSupplierMapper.selectByExample(example);
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssSupplierMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteOfBatch(List list) throws Exception {
		bssSupplierMapper.deleteOfbatch(list);
	}

	@Override
	public List<BssSupplier> findDim(String str) throws Exception {
		return bssSupplierMapper.findDim(str);
	}

}
