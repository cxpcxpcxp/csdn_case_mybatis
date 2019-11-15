package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO {
    @Select("select * from user")
    public List<User> findAll();
}
