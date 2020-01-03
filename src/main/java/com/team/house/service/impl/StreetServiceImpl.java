package com.team.house.service.impl;

import com.team.house.entity.Street;
import com.team.house.entity.StreetExample;
import com.team.house.mapper.StreetMapper;
import com.team.house.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetServiceImpl
 * @Description TODO
 * @Date 2019/12/27 9:18
 * @Created by Administrator
 */
@Service(value ="streetServiceImpl2" )
public class StreetServiceImpl implements StreetService {


    @Autowired
    private StreetMapper streetMapper;
    @Override
    public List<Street> getStreetByDistrict(Integer did) {
        StreetExample streetExample=new StreetExample();
        StreetExample.Criteria criteria=streetExample.createCriteria();
        //添加条件
        criteria.andDistrictIdEqualTo(did);
        return streetMapper.selectByExample(streetExample);
    }


    //测试业务方法
    public static void main(String[] args) {
       //创建spring容器
       //创建spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //找对象调有
        StreetService streetService=(StreetService)ctx.getBean("streetServiceImpl2");
        System.out.println("街道个数是:"+streetService.getStreetByDistrict(1002).size());
    }
}
