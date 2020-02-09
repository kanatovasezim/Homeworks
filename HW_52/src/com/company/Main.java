package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
         DBcars dBcars = new DBcars();
         ArrayList<Car>  cars = dBcars.getAllCars();
        HashMap< Integer, Car> hashMapcars = new HashMap<>();
        for (Car c : cars ) {
            hashMapcars.put(c.getId(), c);
        }
        System.out.println(hashMapcars);
    }
}
