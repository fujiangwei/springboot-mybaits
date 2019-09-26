package com.kinson.bat.service.impl;

import com.kinson.bat.service.UserService;
import com.kinson.comm.domain.User;
import com.kinson.comm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * descripiton:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> listUser() {
        return userMapper.selectUserList();
    }
}
