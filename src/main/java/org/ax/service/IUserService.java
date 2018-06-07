package org.ax.service;

import org.ax.bean.User;

public interface IUserService {
    public User updateUser(User user);
    public User queryUser();
}
