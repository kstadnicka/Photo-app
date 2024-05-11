package org.kamilastd.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    String url;
    String user;
    String password;
    Connection conn;


    public DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/photo-app-db";
        this.user = "root";
        this.password = "admin";
    }

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }


}
