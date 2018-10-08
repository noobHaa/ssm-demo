package com.dao;

import com.model.User;

/**
 * @Author ll
 * @Date 2018/9/29 17:02
 */
public interface UserDao {
    User queryByID(Long id);
}
