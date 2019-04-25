package com.example.bss.service;

import java.util.List;
import java.util.Map;

import com.example.bss.pojo.BssSystemLog;

public interface BssSystemLogService {
	/**
	 * 插入表
	 * 
	 * @param lx
	 * @param nr
	 * @param username
	 * @param ip
	 * @param createTime
	 * @throws Exception
	 */
	void insertSystemLog(String lx, String nr, String username, String ip, String createTime) throws Exception;

	/**
	 * 查询指定系统日志
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssSystemLog> findByObjectSystemLog(String str) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @return
	 * @throws Exception
	 */
	List<BssSystemLog> showSystemLog() throws Exception;

	/**
	 * 删除指定系统日志
	 */
	void deleteById(int id) throws Exception;

	/**
	 * 批量删除系统日志
	 */
	void deleteOfBatch(List list) throws Exception;
}
