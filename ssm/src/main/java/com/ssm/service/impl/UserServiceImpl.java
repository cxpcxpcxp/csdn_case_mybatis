package com.ssm.service.impl;

import com.ssm.dao.IUserDAO;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO dao;
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
