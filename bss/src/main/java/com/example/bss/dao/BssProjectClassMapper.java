package com.example.bss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.bss.pojo.BssProjectClass;
import com.example.bss.pojo.BssProjectClassExample;

@Mapper
public interface BssProjectClassMapper {
	/**
	 * 根据指定的条件获取数据库记录数,bss_project_class
	 *
	 * @param example
	 */
	long countByExample(BssProjectClassExample example);

	/**
	 * 根据指定的条件删除数据库符合条件的记录,bss_project_class
	 *
	 * @param example
	 */
	int deleteByExample(BssProjectClassExample example);

	/**
	 * 根据主键删除数据库的记录,bss_project_class
	 *
	 * @param id
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 新写入数据库记录,bss_project_class
	 *
	 * @param record
	 */
	int insert(BssProjectClass record);

	/**
	 * 动态字段,写入数据库记录,bss_project_class
	 *
	 * @param record
	 */
	int insertSelective(BssProjectClass record);

	/**
	 * 根据指定的条件查询符合条件的数据库记录,bss_project_class
	 *
	 * @param example
	 */
	List<BssProjectClass> selectByExample(BssProjectClassExample example);

	/**
	 * 根据指定主键获取一条数据库记录,bss_project_class
	 *
	 * @param id
	 */
	BssProjectClass selectByPrimaryKey(Integer id);

	/**
	 * 动态根据指定的条件来更新符合条件的数据库记录,bss_project_class
	 *
	 * @param record
	 * @param example
	 */
	int updateByExampleSelective(@Param("record") BssProjectClass record,
			@Param("example") BssProjectClassExample example);

	/**
	 * 根据指定的条件来更新符合条件的数据库记录,bss_project_class
	 *
	 * @param record
	 * @param example
	 */
	int updateByExample(@Param("record") BssProjectClass record, @Param("example") BssProjectClassExample example);

	/**
	 * 动态字段,根据主键来更新符合条件的数据库记录,bss_project_class
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(BssProjectClass record);

	/**
	 * 根据主键来更新符合条件的数据库记录,bss_project_class
	 *
	 * @param record
	 */
	int updateByPrimaryKey(BssProjectClass record);

	int insertBatchSelective(List<BssProjectClass> records);

	int updateBatchByPrimaryKeySelective(List<BssProjectClass> records);

	/**
	 * 批量删除数据库的记录
	 *
	 * @param id
	 */
	int deleteOfbatch(@Param("idList") List idList);

	/**
	 * 模糊查询
	 * 
	 * @param id
	 * @return
	 */
	List<BssProjectClass> findDim(String dim_str);
    /**
     *  根据主键来更新符合条件的数据库记录,bss_project_class
     *
     * @param record
     */
    @Select("SELECT id FROM bss_project_class WHERE lb=#{lb}")
    Integer selectIdByLB(String lb);
}