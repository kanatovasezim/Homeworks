package com.company.dao;

import com.company.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
        public Person getPersonById(Integer id) {
            String SQL = "select * from persons where id = ? ";
            try (Connection conn = DB.connect();
                 PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setInt(1,id);
                try(ResultSet rs = statement.executeQuery()){
                    if(rs.next()) {
                        Person person = new Person();
                        person.setId(rs.getInt("ID"));
                        person.setName(rs.getString("NAME"));
                        person.setGender(rs.getInt("GENDER"));
                        person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                        person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                        return person;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    public Person getPersonAllParam(Integer id, String name, Integer year) {
        String SQL = "select * from persons where id = ? and name = '?' and year = ?";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(1,year);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("ID"));
                    person.setName(rs.getString("NAME"));
                    person.setGender(rs.getInt("GENDER"));
                    person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                    person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                    return person;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Person getPersonByNameByYear(String name, Integer year) {
        String SQL = "select * from persons where name = '?' and year = ?";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(2,year);
            statement.setString(1,name);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("ID"));
                    person.setName(rs.getString("NAME"));
                    person.setGender(rs.getInt("GENDER"));
                    person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                    person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                    return person;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Person getPersonByIdByYear(Integer id, Integer year) {
        String SQL = "select * from persons where id = ? and year = ?";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(2,year);
            statement.setInt(1,id);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("ID"));
                    person.setName(rs.getString("NAME"));
                    person.setGender(rs.getInt("GENDER"));
                    person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                    person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                    return person;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Person getPersonByIDByName(Integer id, String name) {
        String SQL = "select * from persons where id = ? and name = '?' ";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(1,id);
            statement.setString(2,name);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("ID"));
                    person.setName(rs.getString("NAME"));
                    person.setGender(rs.getInt("GENDER"));
                    person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                    person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                    return person;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Person getPersonByName(String name) {
        String SQL = "select * from persons where name = '?' ";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,name);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("ID"));
                    person.setName(rs.getString("NAME"));
                    person.setGender(rs.getInt("GENDER"));
                    person.setYear_birth(rs.getInt("YEAR_BIRTH"));
                    person.setRegistr_time(rs.getDate("REGISTR_DATE"));
                    return person;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

        public List<Person> getAllPeople() {
            String SQL = "select * from Persons ";
            List<Person> peopleList = new ArrayList<>();
            try (Connection conn = DB.connect();
                 Statement statement = conn.createStatement();
                 ResultSet rs = statement.executeQuery(SQL)) {
                while (rs.next()) {
                    peopleList.add(Person.builder()
                            .id(rs.getInt("ID"))
                            .name(rs.getString("NAME"))
                            .gender(rs.getInt("GENDER"))
                            .year_birth(rs.getInt("YEAR_BIRTH"))
                            .registr_time(rs.getDate("REGISTR_TIME"))
                            .build());

                    return peopleList;

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
        public Person addPerson(Person person){
            String SQL = "insert into persons(name, year_birth, gender, registr_time) values (?, ?, ?, now())";
            try (Connection conn = DB.connect();
                 PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setString(1, person.getName());
                statement.setInt(2, person.getYear_birth());
                statement.setInt(3, person.getGender());
                statement.executeUpdate();// How to get inserted ID
                return person;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean deletePerson(Integer id){
            String SQL = "delete from persons where id = ?";
            try (Connection conn = DB.connect();
                 PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setInt(1, id);
                statement.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

