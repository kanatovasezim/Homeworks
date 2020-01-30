package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        BD db = new BD();
        db.getTrainersSalary();
        db.printSum();
        db.getCharacterCount();
    }
}
