package com.service;

import com.model.User;

/**
 * @Author ll
 * @Date 2018/9/29 17:08
 */
public interface UserService {
    User queryUserByID(Long id);
}
