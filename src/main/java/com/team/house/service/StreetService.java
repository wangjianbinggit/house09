package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.Street;
import com.team.house.entity.Type;
import com.team.house.util.PageUtil;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistritctService
 * @Description TODO
 * @Date 2019/12/20 16:42
 * @Created by Administrator
 */
public interface StreetService {
     /**
      * 查询对应区域下的街道
      * @return
      */
     public List<Street> getStreetByDistrict(Integer did);

}
