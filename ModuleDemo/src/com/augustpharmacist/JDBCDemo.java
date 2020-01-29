package com.augustpharmacist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
//        1.导入jar包
//        2.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        3.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
//        4.sql
//         String sql = "insert into firstone values (null,'东东',22,null)";
            String sql = "delete from firstone where id=6";
//        5.获取statement对象
            statement = conn.createStatement();
//        6.执行sql语句获取结果集
            int i = statement.executeUpdate(sql);
//        7.处理结果集
            if (i > 0) {
                System.out.println("操作->执行成功");
            } else {
                System.out.println("操作->未执行");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//        8.关闭资源
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
