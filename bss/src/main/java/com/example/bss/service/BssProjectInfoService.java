package com.example.bss.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.bss.pojo.BssProjectInfo;
import com.example.bss.pojo.BssProjectInfoExample;

public interface BssProjectInfoService {
	/**
	 * 插入表
	 */
	void insertProjectInfo(BssProjectInfo bssProjectInfo) throws Exception;
	/**
	 * 修改表
	 */
	void updateProjectInfo(BssProjectInfo bssProjectInfo) throws Exception;

	/**
	 * 查询指定对象查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssProjectInfo> findProjectInfo(BssProjectInfoExample example) throws Exception;

	/**
	 * 根据主键删除
	 */
	void deleteById(int id) throws Exception;

	/**
	 * 批量删除
	 */
	Map<String, Object> deleteOfBatch(List list) throws Exception;
	
	/**
	 * 模糊查询
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssProjectInfo> findDim(String str) throws Exception;
	/**
	 * 查询关联表字段
	 * 
	 * @return
	 * @throws Exception
	 */
	HashMap<String, Object> selectJoinList() throws Exception;
	/**
	 * 保存项目信息
	 * 
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> saveProjectInfo(Map<String, String> info,String flag) throws Exception;
	/**
	 * 查询项目信息表关联其他表取名称
	 * @param str
	 * @return
	 * @throws Exception
	 */
	HashMap<String, Object> selectProjectInfoJoinAll(Integer projectid) throws Exception;
}
