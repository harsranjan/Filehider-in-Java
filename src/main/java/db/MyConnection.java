package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;

public class MyConnection {
    public static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/filehider?useSSL=false", "root", "password");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection Enstablished......");
        return connection;
    }
    public static void closeConnection() {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }



}
