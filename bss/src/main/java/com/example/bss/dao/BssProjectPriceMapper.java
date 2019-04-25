package com.example.bss.dao;

import com.example.bss.pojo.BssProjectPrice;
import com.example.bss.pojo.BssProjectPriceExample;
import com.example.bss.pojo.BssSupplier;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BssProjectPriceMapper {
    /**
     *  根据指定的条件获取数据库记录数,bss_project_price
     *
     * @param example
     */
    long countByExample(BssProjectPriceExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,bss_project_price
     *
     * @param example
     */
    int deleteByExample(BssProjectPriceExample example);

    /**
     *  根据主键删除数据库的记录,bss_project_price
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bss_project_price
     *
     * @param record
     */
    int insert(BssProjectPrice record);

    /**
     *  动态字段,写入数据库记录,bss_project_price
     *
     * @param record
     */
    int insertSelective(BssProjectPrice record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bss_project_price
     *
     * @param example
     */
    List<BssProjectPrice> selectByExample(BssProjectPriceExample example);

    /**
     *  根据指定主键获取一条数据库记录,bss_project_price
     *
     * @param id
     */
    BssProjectPrice selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,bss_project_price
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BssProjectPrice record, @Param("example") BssProjectPriceExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,bss_project_price
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BssProjectPrice record, @Param("example") BssProjectPriceExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bss_project_price
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BssProjectPrice record);

    /**
     *  根据主键来更新符合条件的数据库记录,bss_project_price
     *
     * @param record
     */
    int updateByPrimaryKey(BssProjectPrice record);

    int insertBatchSelective(List<BssProjectPrice> records);

    int updateBatchByPrimaryKeySelective(List<BssProjectPrice> records);
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
	List<BssProjectPrice> findDim(String dim_str);
	/**
	 * 查询对应的项目id
	 * @param idList
	 * @return
	 */
	List<BssProjectPrice> selectProject_idList(@Param("idList") List idList);
	/**
	 * 查询对应的项目id
	 * @param idList
	 * @return
	 */
	BssProjectPrice selectProject_id(@Param("projectId") Integer projectId);
}