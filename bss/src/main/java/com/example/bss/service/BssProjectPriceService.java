package com.example.bss.service;

import java.util.List;

import com.example.bss.pojo.BssProjectPrice;
import com.example.bss.pojo.BssProjectPriceExample;

public interface BssProjectPriceService {
	/**
	 * 插入表
	 */
	void insertProjectPrice(BssProjectPrice bssProjectPrice) throws Exception;
	/**
	 * 修改表
	 */
	void updateProjectPrice(BssProjectPrice bssProjectPrice) throws Exception;

	/**
	 * 查询指定对象查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssProjectPrice> findProjectPrice(BssProjectPriceExample example) throws Exception;

	/**
	 * 根据主键删除
	 */
	void deleteById(int id) throws Exception;

	/**
	 * 批量删除
	 */
	void deleteOfBatch(List list) throws Exception;
	
	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssProjectPrice> findDim(String str) throws Exception;
}
