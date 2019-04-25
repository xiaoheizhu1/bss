package com.example.bss.service;

import java.util.List;

import com.example.bss.pojo.BssCostDepartment;
import com.example.bss.pojo.BssCostDepartmentExample;

public interface BssCostDepartmentService {
	/**
	 * 插入表
	 */
	void insertCostDepartment(BssCostDepartment bssCostDepartment) throws Exception;
	/**
	 * 修改表
	 */
	void updateCostDepartment(BssCostDepartment bssCostDepartment) throws Exception;

	/**
	 * 查询指定对象查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssCostDepartment> findCostDepartment(BssCostDepartmentExample example) throws Exception;

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
	List<BssCostDepartment> findDim(String str) throws Exception;
}
