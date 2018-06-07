package org.ax.mapper;

import java.util.List;
import org.ax.bean.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

// 通过搜索的数据，返回java对象
//public interface UserMapper {
//    int insert(User user);
//    List<User> selectAll();
////    User selectByPrimaryKey(String uid);
////    User selectByName(String name);
////    User selectByEmail(String email);
////    int delectUser(User user);
//}

public class UserMapper implements RowMapper{
    public User mapRow(ResultSet rs,int rowNum) throws SQLException{
        User user = new User();
        user.setUid(rs.getString("uid"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        user.setEmail(rs.getString("email"));
        return user;
    }
}
