package com.lipeng.service;

import com.lipeng.bean.User;

/**
 * Created by dllo on 18/2/26.
 */
public interface UserService {
    void register(User user);
    User login(User user);
}
