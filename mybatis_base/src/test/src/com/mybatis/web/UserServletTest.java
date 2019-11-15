package com.mybatis.web;

import com.mybatis.dao.IUser2DAO;
import com.mybatis.dao.IUserDAO;
import com.mybatis.domain.User;
import com.mybatis.domain.User2;
import com.mybatis.utils.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserServletTest {
    @Test
    public void findAllTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void findAllTest2(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUser2DAO mapper = sqlSession.getMapper(IUser2DAO.class);
        List<User2> all = mapper.findAll();
        for (User2 user2 : all) {
            System.out.println(user2);
        }
    }

    @Test
    public void saveTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUser2DAO mapper = sqlSession.getMapper(IUser2DAO.class);
        User2 user2 = new User2();
        user2.setName("加盐盐3");
        mapper.save(user2);
        sqlSession.commit();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUser2DAO mapper = sqlSession.getMapper(IUser2DAO.class);
        int id=1;
        mapper.delete(id);
        sqlSession.commit();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUser2DAO mapper = sqlSession.getMapper(IUser2DAO.class);
        User2 user2 = new User2();
        user2.setId(2);
        user2.setName("加盐盐");
        mapper.update(user2);
        sqlSession.commit();
    }

    @Test
    public void findByNameTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUser2DAO mapper = sqlSession.getMapper(IUser2DAO.class);
        String name = "%加盐盐%";
        List<User2> byName = mapper.findByName(name);
        for (User2 user2 : byName) {
            System.out.println(user2);
        }
    }
}
