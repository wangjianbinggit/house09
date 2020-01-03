package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.House;
import com.team.house.util.PageUtil;
import com.team.house.util.SearchCondition;

import java.util.List;

/**
 * @author 王建兵
 * @Classname HouseService
 * @Description TODO
 * @Date 2019/12/27 10:45
 * @Created by Administrator
 */
public interface HouseService {

    /**
     * 添加出租房
     * @param house 出租房实体
     * @return
     */
    public int addHouse(House house);

    /**
     * 查询用户发布的出租房信息
     * @param id  用户编号
     * @return  出租房信息
     */
    PageInfo<House> getHouseByUser(Integer id, PageUtil pageUtil);

    /**
     * 查询某出租房的信息
     * @param id  编号
     * @return  出租房实体
     */
    House getHouse(String id);

    /**
     * 修改出租房信息
     * @param house  出租房实体
     * @return 影响的行数
     */
    int updateHouse(House house);


    /**
     * 更新出租房删除的状态
     * @param houseId 出租房编号
     * @param delState   删除的状诚
     * 状态为1 表示删除出租房     0表示恢复出租房，不删除
     * @return 影响
     */
    public int deleleHouse(String houseId,Integer delState);


    /**
     * 查询所有后台出租房信息
     * @param pageUtil 分页参数
     * @return 出租房信息
     */
    public PageInfo<House> getBackAllHouse(PageUtil pageUtil);

    /**
     * 更新出租房的审核状态
     * @param houseId  出租房编号
     * @param passState  状态
     * @return 影响行数
     */
    public int passHouse(String houseId,Integer passState);

    /**
     *  浏览所有出租房
     * @param searchCondition  分页参数和查询条件
     * @return  出租房实体集合
     */
    public PageInfo<House> getBroswerHouse(SearchCondition searchCondition);
    // public PageInfo<House> getBroswerHouse(PageUtil pageUtil);


}
