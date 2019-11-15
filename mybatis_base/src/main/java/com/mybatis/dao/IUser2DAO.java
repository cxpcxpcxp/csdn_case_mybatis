package com.mybatis.dao;

import com.mybatis.domain.User2;

import java.util.List;

public interface IUser2DAO {
//    查询所有
    public List<User2> findAll();
//    保存
    public void save(User2 user2);
//    删除
    public void delete(int uid);
//    更新
    public void update(User2 user2);
//    模糊查询
    public List<User2> findByName(String name);
}
