package com.augustpharmacist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDemo {
    public void login(String name, String pwd) {
        User user = new User();
        Connection conn = null;
        PreparedStatement preStm = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            // 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            // sql
            String sql = "select * from usertb where name=?";
            // 获取PreparedStatement对象
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, name);
            // 执行sql, 获取结果集
            rs = preStm.executeQuery();
            // 处理结果集
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPwd(rs.getString(3));
                System.out.println(user.toString());
            }
            if (user.getPwd().equals(pwd)) {
                flag = true;
            }
            if (flag) {
                System.out.println("登陆成功");
            } else {
                System.out.println("账号或密码错误, 登录失败.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                preStm.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
