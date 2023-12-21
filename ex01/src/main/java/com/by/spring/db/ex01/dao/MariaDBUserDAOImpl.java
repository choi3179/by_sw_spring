package com.by.spring.db.ex01.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBUserDAOImpl extends UserDAO {
    @Override
    public Connection getConnection() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mariadb://127.0.0.1:3306/sampledb";
        String uid = "root";
        String pwd = "root";

        Connection conn = DriverManager.getConnection(url, uid, pwd);

        return conn;
    }
}
