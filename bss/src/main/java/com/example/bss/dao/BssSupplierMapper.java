package com.example.bss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.bss.pojo.BssSupplier;
import com.example.bss.pojo.BssSupplierExample;
@Mapper
public interface BssSupplierMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_supplier
     *
     * @param example
     */
    long countByExample(BssSupplierExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_supplier
     *
     * @param example
     */
    int deleteByExample(BssSupplierExample example);

    /**
     *  根据主键删除数据库的记录,bss_supplier
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bss_supplier
     *
     * @param record
     */
    int insert(BssSupplier record);

    /**
     *  动态字段,写入数据库记录,bss_supplier
     *
     * @param record
     */
    int insertSelective(BssSupplier record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_supplier
     *
     * @param example
     */
    List<BssSupplier> selectByExample(BssSupplierExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_supplier
     *
     * @param id
     */
    BssSupplier selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_supplier
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssSupplier record, @Param("example") BssSupplierExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_supplier
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssSupplier record, @Param("example") BssSupplierExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_supplier
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssSupplier record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_supplier
     *
     * @param record
     */
    int updateByPrimaryKey(BssSupplier record);

    int insertBatchSelective(List<BssSupplier> records);

    int updateBatchByPrimaryKeySelective(List<BssSupplier> records);
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
	List<BssSupplier> findDim(String dim_str);
    /**
     *  根据供应商名称查询id,bss_supplier
     *
     * @param record
     */
    @Select("SELECT id FROM bss_supplier WHERE gysmc = #{gysmc}")
    Integer selectIdByGysmc(String gysmc);
}