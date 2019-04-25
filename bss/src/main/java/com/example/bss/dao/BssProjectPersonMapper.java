package com.example.bss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.pojo.BssProjectPersonExample;
@Mapper
public interface BssProjectPersonMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_project_person
     *
     * @param example
     */
    long countByExample(BssProjectPersonExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_project_person
     *
     * @param example
     */
    int deleteByExample(BssProjectPersonExample example);

    /**
     *  根据主键删除数据库的记录,bss_project_person
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bss_project_person
     *
     * @param record
     */
    int insert(BssProjectPerson record);

    /**
     *  动态字段,写入数据库记录,bss_project_person
     *
     * @param record
     */
    int insertSelective(BssProjectPerson record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_project_person
     *
     * @param example
     */
    List<BssProjectPerson> selectByExample(BssProjectPersonExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_project_person
     *
     * @param id
     */
    BssProjectPerson selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_project_person
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssProjectPerson record, @Param("example") BssProjectPersonExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_project_person
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssProjectPerson record, @Param("example") BssProjectPersonExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_project_person
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssProjectPerson record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_project_person
     *
     * @param record
     */
    int updateByPrimaryKey(BssProjectPerson record);

    int insertBatchSelective(List<BssProjectPerson> records);

    int updateBatchByPrimaryKeySelective(List<BssProjectPerson> records);
    
    /**
     * 查询全表
     * @param id
     * @return
     */
	List<BssProjectPerson> findAll();
	
	/**
	 * 根據动态字段查詢表
	 * @param record
	 * @return
	 */
	BssProjectPerson findByObject(BssProjectPerson record);
	
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
	List<BssProjectPerson> findDim(String dim_str);
	/**
	 * 根據姓名字段返回id
	 * @param record
	 * @return
	 */
	@Select("SELECT id FROM bss_project_person WHERE xm = #{xm}")
	Integer selectIdByXm(String xm);
}