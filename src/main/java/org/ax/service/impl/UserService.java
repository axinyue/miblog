package org.ax.service.impl;

import org.ax.bean.User;
import org.ax.dao.UserDao;
import java.util.List;
import org.ax.mapper.UserMapper;
import javax.sql.DataSource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserService implements UserDao {
    private DataSource dataSouce;
    private JdbcTemplate jdbcTemplateObj;
    public void setDataSouce(DataSource dataSouce){
        this.dataSouce = dataSouce;
        this.jdbcTemplateObj = new JdbcTemplate(dataSouce);
    }

    public List<User> selectAll(){
        String sql = "select * from blog_user;";
        List<User> user = jdbcTemplateObj.query(sql,new UserMapper());
        return user;
    }
}
