package com.service.impl;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ll
 * @Date 2018/9/29 17:09
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User queryUserByID(Long id) {
        return userDao.queryByID(id);
    }
}
