package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.Type;
import com.team.house.entity.Users;
import com.team.house.util.PageUtil;
import com.team.house.util.UserCondition;

/**
 * @author 王建兵
 * @Classname DistritctService
 * @Description TODO
 * @Date 2019/12/20 16:42
 * @Created by Administrator
 */
public interface UserService {
     /**
      * 查询区域带分页
      * @param condition
      *   包含查询的条件
      *   page属性接收页码，rows接收页大小
      * @return
      */
     public PageInfo<Users> getUserByPage(UserCondition condition);

     /**
      * 检查用户名是否存在
      * @param name  用户名
      * @return  布尔类型  可用返回true,不可用返回false
      */
     public boolean checkUname(String name);

     /**
      * 注册用户
      * @param users  用户实体
      * @return  影响行数
      */
     public int addUser(Users users);


     /**
      * 用户的登入
      * @param usernmae  用户名
      * @param password  密码
      * @return 返回用户的信息
      */
     public Users login(String usernmae,String password);

}
