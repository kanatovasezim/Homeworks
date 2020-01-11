package com.company;

import java.sql.*;

public class BD {

    private  final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "232312dk";

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void getTrainersSalary(){
        String SQL = "select t.name, st.salary from trainers t join sport_type st on t.sport_type=st.id order by salary desc;";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)){
             while (rs.next()){
                 System.out.println(rs.getString("NAME")+ " " + rs.getInt("SALARY"));
             }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public void printSum(){
        String SQL = "select sum(salary) as total from sport_type;";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)){
             rs.next();
            System.out.println("Total: " + rs.getInt("Total"));
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public void getCharacterCount(){
        String SQL = "select length(name) as length from trainers;";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)){
            while (rs.next()) {
                if (rs.getInt(1) > 3){
                    System.out.println("Молодец");
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

}

