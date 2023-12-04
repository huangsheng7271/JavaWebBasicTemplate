package com.closeai.aisharehub.service.impl;

import com.closeai.aisharehub.mapper.UserMapper;
import com.closeai.aisharehub.model.Users;
import com.closeai.aisharehub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Users getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}