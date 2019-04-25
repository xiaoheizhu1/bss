package com.example.bss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.bss.pojo.BssCostDepartment;
import com.example.bss.pojo.BssCostDepartmentExample;
@Mapper
public interface BssCostDepartmentMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_cost_department
     *
     * @param example
     */
    long countByExample(BssCostDepartmentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_cost_department
     *
     * @param example
     */
    int deleteByExample(BssCostDepartmentExample example);

    /**
     *  根据主键删除数据库的记录,bss_cost_department
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bss_cost_department
     *
     * @param record
     */
    int insert(BssCostDepartment record);

    /**
     *  动态字段,写入数据库记录,bss_cost_department
     *
     * @param record
     */
    int insertSelective(BssCostDepartment record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_cost_department
     *
     * @param example
     */
    List<BssCostDepartment> selectByExample(BssCostDepartmentExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_cost_department
     *
     * @param id
     */
    BssCostDepartment selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_cost_department
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssCostDepartment record, @Param("example") BssCostDepartmentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_cost_department
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssCostDepartment record, @Param("example") BssCostDepartmentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_cost_department
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssCostDepartment record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_cost_department
     *
     * @param record
     */
    int updateByPrimaryKey(BssCostDepartment record);

    int insertBatchSelective(List<BssCostDepartment> records);

    int updateBatchByPrimaryKeySelective(List<BssCostDepartment> records);
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
	List<BssCostDepartment> findDim(String dim_str);
    /**
     *  根据费用归属部门名称查询ID,bss_cost_department
     *
     * @param record
     */
    @Select("SELECT id FROM bss_cost_department WHERE bmmc = #{bmmc} ")
    Integer selectIdByBmmc(String bmmc);
}