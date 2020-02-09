package com.company;

import java.sql.*;
import java.util.ArrayList;

public class DBcars {

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

    public ArrayList<Car> getAllCars() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        String SQL = "select * from cars";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
                while (rs.next()) {
                    Car car = new Car();
                    car.setId(rs.getInt("ID"));
                    car.setManufactureYear(rs.getString("Manufacture_year"));
                    car.setModel(rs.getString("MODEL"));
                    car.setPrice(rs.getInt("PRICE"));
                    car.setColor(rs.getString("COLOR"));
                    carArrayList.add(car);

                }
                return carArrayList;
        }catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "DBcars{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



