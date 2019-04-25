package com.example.bss.service;

import java.util.List;

import com.example.bss.pojo.BssProjectClass;
import com.example.bss.pojo.BssProjectClassExample;

public interface BssProjectClassService {
	/**
	 * 插入表
	 */
	void insertProjectClass(BssProjectClass bssProjectClass) throws Exception;
	/**
	 * 修改表
	 */
	void updateProjectClass(BssProjectClass bssProjectClass) throws Exception;

	/**
	 * 查询指定对象查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssProjectClass> findProjectClass(BssProjectClassExample example) throws Exception;

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
	List<BssProjectClass> findDim(String str) throws Exception;
}
