package org.ax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ax.bean.User;
import java.util.List;

import org.ax.service.impl.UserService;
public class spring_main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserService userService = (UserService) context.getBean("UserTemplate");
        List<User> users = userService.selectAll();
        for (User user:users){
            System.out.println("ID:"+user.getUid());
        }
    }
}
