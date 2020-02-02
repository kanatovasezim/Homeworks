package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DB {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "232312dk";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void register(User user){
        String SQL = "Insert into users(login, email,password, date_regisr) values (?,?,?, now())";
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getMail());
            stmt.setString(3, schiffer(user));
            stmt.executeUpdate();
            System.out.println("Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void authorize(String login, String password){
        String SQL = "Insert into userlogs(userlogin, login_time, success) values (?, now() ,?)";
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setString(1, login);
            if (getUserByLogin(login) != null){
                if (schiffer(password).equals(getUserByLogin(login).getPassword())){
                stmt.setString(2, Success.OK.toString());
                System.out.println("Успешно");
                stmt.executeUpdate();
            } else {
                stmt.setString(2, Success.FAIL.toString());
                System.out.println("Не успешно");
                stmt.executeUpdate();
            }} else {
                stmt.setString(2, Success.FAIL.toString());
                System.out.println("Такого логина не существует");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String schiffer(User u){
        String pass = "";
        char[] chars = u.getPassword().toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            pass+= chars[i];
        }
        pass += chars[0];
        return pass;
    }
    public String schiffer(String u){
        String pass = "";
        char[] chars = u.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            pass+= chars[i];
        }
        pass += chars[0];
        return pass;
    }
    public User getUserByLogin(String login) {
        String SQL = "select * from users where login = ?";
        try (Connection conn = connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,login);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("ID"));
                    user.setLogin(rs.getString("LOGIN"));
                    user.setMail(rs.getString("EMAIL"));
                    user.setPassword(rs.getString("PASSWORD"));
                    user.setRegDate(rs.getDate("Date_regisr"));
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<AuthUser> getAuthUsers() {
        ArrayList<AuthUser> authUsers = new ArrayList<>();
        String SQL = "select * from userlogs";
        try (Connection conn = connect();
             Statement statement = conn.createStatement()) {
            try(ResultSet rs = statement.executeQuery(SQL)){
                while (rs.next()) {
                    AuthUser user = new AuthUser();
                    user.setuserlogin(rs.getString("USERLOGIN"));
                    user.setLogin_time(rs.getDate("LOGIN_TIME"));
                    user.getSuccess(rs.getString("SUCCESS"));
                    authUsers.add(user);
                }
                return authUsers;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

