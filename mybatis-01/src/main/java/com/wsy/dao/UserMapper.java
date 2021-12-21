package com.wsy.dao;

import com.wsy.pojo.User;

import java.util.List;

public interface UserMapper {
//    获取全部用户
    List<User> getUserList();
//    根据id查找用户
    User getUserById(int id);
}
