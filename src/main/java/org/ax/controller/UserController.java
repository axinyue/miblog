package org.ax.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.ax.mapper.UserMapper;
import org.ax.pojo.User;

/**
 * @describe: 读取一个用户下的所有订单
 * @author: Yiibai
 * @version: V1.0
 * @copyright http://www.yiibai.com
 */

// http://localhost:8080/mybatis07-spring-mvc/user/orders
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserMapper userMaper;

    @RequestMapping("/user")
    public String listall(HttpServletRequest request,HttpServletResponse response){
        User user = userMaper.getUserByID("asd");
        System.out.println("user"+user.getName());

        return "";
    }
}