package com.anno.dao;

import com.anno.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDAO {
    @Select(value = "select * from user")
    public List<User> findAll();

    @Insert(value = "insert into user values(null,#{name})")
    public void save(User user);

    @Delete(value = "delete from user where id=#{uid}")
    public void delete(int uid);

    @Update(value = "update user set name=#{name} where id=#{id}")
    public void update(User user);

    @Select(value = "select * from user where name like #{username}")
    public List<User> findByName(String name);
}
