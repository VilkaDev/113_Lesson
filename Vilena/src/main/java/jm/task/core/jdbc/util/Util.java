package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String user = "root";
    private static final String password = "root";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password); // устанавливаем соединение БД с MySQL
            System.out.println("Connection OK");
        } catch (SQLException e) {
            System.out.println("Connection ERROR");
        }
        return connection;
    }


}
