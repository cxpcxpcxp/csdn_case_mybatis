package com.one2one.dao;

import com.one2one.domain.Users;

import java.util.List;

public interface IUserDAO {
    public List<Users> findByOne2One();
}
