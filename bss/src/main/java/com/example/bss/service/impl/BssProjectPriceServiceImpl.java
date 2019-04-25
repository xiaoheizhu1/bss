package com.example.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bss.dao.BssProjectPriceMapper;
import com.example.bss.pojo.BssProjectPrice;
import com.example.bss.pojo.BssProjectPriceExample;
import com.example.bss.service.BssProjectPriceService;
@Service
public class BssProjectPriceServiceImpl implements BssProjectPriceService {

	@Autowired
	private BssProjectPriceMapper bssProjectPriceMapper;

	@Override
	public void insertProjectPrice(BssProjectPrice bssProjectPrice) throws Exception {
		bssProjectPriceMapper.insert(bssProjectPrice);

	}

	@Override
	public void updateProjectPrice(BssProjectPrice bssProjectPrice) throws Exception {
		bssProjectPriceMapper.updateByPrimaryKeySelective(bssProjectPrice);
	}

	@Override
	public List<BssProjectPrice> findProjectPrice(BssProjectPriceExample example) throws Exception {
		return bssProjectPriceMapper.selectByExample(example);
	}

	@Override
	public void deleteById(int id) throws Exception {
		bssProjectPriceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteOfBatch(List list) throws Exception {
		bssProjectPriceMapper.deleteOfbatch(list);
	}

	@Override
	public List<BssProjectPrice> findDim(String str) throws Exception {
		return bssProjectPriceMapper.findDim(str);
	}

}
