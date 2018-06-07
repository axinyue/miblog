package org.ax.dao;

import org.ax.bean.User;
import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
