package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BD {
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
    public void addCity(int i, City c) {
        String SQL = "INSERT INTO cities_2 (id,name) values(?,?)";

        try (Connection connection = this.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);){
                    statement.setObject(1, i);
                    statement.setObject(2, c.getName());
                    statement.executeUpdate();
                    System.out.println("Done");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<City> getCity() {
        List<City> cities = new ArrayList();
        String SQL = "SELECT * FROM cities_2 order by id asc";

        try (Connection connection = this.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)){
                while (resultSet.next()) {
                    City city = new City();
                    city.setId(resultSet.getInt("id"));
                    city.setName(resultSet.getString("name"));
                    cities.add(city);
                }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return cities;
    }

    public void updateCities(City c) {
        String SQL = "UPDATE cities_2 SET id = ?, name = ? where id=?";

        try (Connection connection = this.connect();
             PreparedStatement statement = connection.prepareStatement(SQL)){
                    statement.setInt(1, c.getId());
                    statement.setString(2, c.getName());
                    statement.setInt(3, c.getId());
                    statement.executeUpdate();
                    System.out.println("Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean hasID(List<City> c1, int i, List<City> c2, int j){
        if (c1.get(i).getId() == c2.get(j).getId()){
            return true;
        } else {
            return false;
        }
    }
}

