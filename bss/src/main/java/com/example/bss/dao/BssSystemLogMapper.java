package com.example.bss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.bss.pojo.BssSystemLog;
import com.example.bss.pojo.BssSystemLogExample;
@Mapper
public interface BssSystemLogMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_system_log
     *
     * @param example
     */
    long countByExample(BssSystemLogExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_system_log
     *
     * @param example
     */
    int deleteByExample(BssSystemLogExample example);

    /**
     *  根据主键删除数据库的记录,bss_system_log
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);
    /**
     *  批量删除数据库的记录,bss_system_log
     *
     * @param id
     */
    int deleteOfbatch(@Param("idList") List idList);

    /**
     *  新写入数据库记录,bss_system_log
     *
     * @param record
     */
    int insert(BssSystemLog record);

    /**
     *  动态字段,写入数据库记录,bss_system_log
     *
     * @param record
     */
    int insertSelective(BssSystemLog record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_system_log
     *
     * @param example
     */
    List<BssSystemLog> selectByExample(BssSystemLogExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_system_log
     *
     * @param id
     */
    BssSystemLog selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_system_log
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssSystemLog record, @Param("example") BssSystemLogExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_system_log
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssSystemLog record, @Param("example") BssSystemLogExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_system_log
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssSystemLog record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_system_log
     *
     * @param record
     */
    int updateByPrimaryKey(BssSystemLog record);

    int insertBatchSelective(List<BssSystemLog> records);

    int updateBatchByPrimaryKeySelective(List<BssSystemLog> records);
    
    /**
     * 查询全表
     * @param id
     * @return
     */
	List<BssSystemLog> findAll();
	/**
	 * 模糊查询
	 * @param id
	 * @return
	 */
	List<BssSystemLog> findDim(String dim_str);
}