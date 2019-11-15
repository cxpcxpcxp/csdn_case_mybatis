package com.oracle.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OJDBCDemo {
    public static void main(String[] args) throws Exception{
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.23.129:1521/orcl";
        String username = "cxp";
        String password = "123456";

//        加载驱动
        Class.forName(driver);

//        获取连接
        Connection connection = DriverManager.getConnection(url,username,password);

//        得到执行sql的statement
        String sql = "select  * from \"temp_user_table\" ";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        System.out.println("id--name--pwd");
        while (resultSet.next()){
            System.out.print(resultSet.getInt("id"));
            System.out.print("---");
            System.out.print(resultSet.getString("user_name"));
            System.out.print("--");
            System.out.println(resultSet.getString("user_pwd"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
