package com.example.bss.service;

import java.util.List;

import com.example.bss.pojo.BssSupplier;
import com.example.bss.pojo.BssSupplierExample;

public interface BssSupplierService {
	/**
	 * 插入表
	 */
	void insertSupplier(BssSupplier bssSupplier) throws Exception;
	/**
	 * 修改表
	 */
	void updateSupplier(BssSupplier bssSupplier) throws Exception;

	/**
	 * 查询指定对象查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssSupplier> findSupplier(BssSupplierExample example) throws Exception;

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
	List<BssSupplier> findDim(String str) throws Exception;
}
