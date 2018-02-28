package com.lipeng.service.impl;

import com.lipeng.bean.User;
import com.lipeng.mapper.UserMapper;
import com.lipeng.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public void register(User user) {
        userMapper.register(user);
    }

    @Override
    public User login(User user) {
        User oldUser = userMapper.login(user);
        User newUser = new User();
        newUser.setId(oldUser.getId());
        newUser.setName(oldUser.getName());
        newUser.setPwd(oldUser.getPwd());
        newUser.setLevel(oldUser.getLevel());
        newUser.setDesc(oldUser.getDesc());
        newUser.setTel(oldUser.getTel());
        newUser.setAddress(oldUser.getAddress());
        return newUser;
    }
}
