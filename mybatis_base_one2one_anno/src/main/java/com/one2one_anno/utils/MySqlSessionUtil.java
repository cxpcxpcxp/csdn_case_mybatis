package com.one2one_anno.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MySqlSessionUtil {
  private static SqlSessionFactory sqlSessionFactory;
  static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      try {
          sqlSessionFactory = builder.build(Resources.getResourceAsStream("sqlMapperConfig.xml"));
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
  public static SqlSession getSqlSession(){
      return sqlSessionFactory.openSession();
  }
}
