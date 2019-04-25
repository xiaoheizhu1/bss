package com.example.bss.dao;

import com.example.bss.pojo.BssProjectInfo;
import com.example.bss.pojo.BssProjectInfoExample;
import com.example.bss.pojo.BssSystemLog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BssProjectInfoMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_project_info
     *
     * @param example
     */
    long countByExample(BssProjectInfoExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_project_info
     *
     * @param example
     */
    int deleteByExample(BssProjectInfoExample example);

    /**
     *  根据主键删除数据库的记录,bss_project_info
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bss_project_info
     *
     * @param record
     */
    int insert(BssProjectInfo record);

    /**
     *  动态字段,写入数据库记录,bss_project_info
     *
     * @param record
     */
    int insertSelective(BssProjectInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_project_info
     *
     * @param example
     */
    List<BssProjectInfo> selectByExample(BssProjectInfoExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_project_info
     *
     * @param id
     */
    BssProjectInfo selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_project_info
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssProjectInfo record, @Param("example") BssProjectInfoExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_project_info
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssProjectInfo record, @Param("example") BssProjectInfoExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_project_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssProjectInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_project_info
     *
     * @param record
     */
    int updateByPrimaryKey(BssProjectInfo record);

    int insertBatchSelective(List<BssProjectInfo> records);

    int updateBatchByPrimaryKeySelective(List<BssProjectInfo> records);
    /**
     *  批量删除数据库的记录
     *
     * @param id
     */
    int deleteOfbatch(@Param("idList") List idList);
	/**
	 * 模糊查询
	 * @param id
	 * @return
	 */
	List<BssProjectInfo> findDim(@Param("dim_str") String dim_str);
	/**
	 * 查询项目信息表关联其他表取名称
	 * @param projectid
	 * @return
	 */
	List<HashMap<String, Object>> selectProjectInfoJoinAll(@Param("projectid") Integer projectid);
}