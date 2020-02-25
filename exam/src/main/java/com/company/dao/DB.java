package com.company.dao;
import java.sql.*;

public class DB {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String Person = "postgres";
    private static final String password = "232312dk";

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, Person, password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


}
