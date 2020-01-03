package com.team.house.mapper;

import com.team.house.entity.House;
import com.team.house.entity.HouseExample;
import com.team.house.util.SearchCondition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    //查询当户下的发布出租房
    List<House> getHouseByUser(Integer userid);

    //查询单条数据
    House getHouse(String id);

    //查询所有出租信息(进行审核)
    List<House> getBackAllHouse();

    //查询浏览出租房   支持搜索
    List<House> getBroswerHouse(SearchCondition searchCondition);

}