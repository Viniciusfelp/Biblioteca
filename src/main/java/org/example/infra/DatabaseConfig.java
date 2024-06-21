package org.example.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static String URL_DB = "jdbc:postgresql://localhost:5432/teste";
    private static String USER = "postgres";
    private static String PASS = "password";

    public static Connection connection;

    public static Connection getConnection() throws SQLException {
        if(connection==null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL_DB, USER, PASS);
        }
        return connection;
    }
}

