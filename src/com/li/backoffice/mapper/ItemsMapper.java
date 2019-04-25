package com.li.backoffice.mapper;


import com.li.backoffice.model.Items;
import com.li.backoffice.model.ItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsMapper {

    /**
     * 返回所有商品
     * @return
     */
    public List<Items> findAllItems();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int countByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int deleteByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int insert(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int insertSelective(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    List<Items> selectByExampleWithBLOBs(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    List<Items> selectByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    Items selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByPrimaryKeySelective(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Wed May 23 15:09:39 CST 2018
     */
    int updateByPrimaryKey(Items record);
}