package com.reservation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/reservation_system?useSSL=false&allowPublicKeyRetrieval=true",
                "javauser",
                "java123"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
