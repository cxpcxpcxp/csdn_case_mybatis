package com.mybatis.dao;

import com.mybatis.domain.User;

import java.util.List;

/**
 * 单表的增删该查
 */
public interface IUserDAO {
    public List<User> findAll();
    public List<User> findByUserName();
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
}
