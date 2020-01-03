package com.team.house.pcontroller;

import com.team.house.entity.District;
import com.team.house.entity.Type;
import com.team.house.service.DistritctService;
import com.team.house.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeController
 * @Description TODO
 * @Date 2019/12/27 8:31
 * @Created by Administrator
 */
@Controller("districtController2")
@RequestMapping("/page/")
public class DistrictController {

    //调用业务
    @Autowired
    private DistritctService distritctService;

    @RequestMapping("getDistritctData")
    @ResponseBody
    public List<District> getDistritctData(){
        return  distritctService.getAllDistrict();
    }

}
