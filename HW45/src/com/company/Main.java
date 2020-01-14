package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BD db = new BD();
	    List<City> cityList1 = generateCountries(3);
	    List<City> cityList2 = generateCountries(5);
        for(int i = 1; i <= cityList1.size() ; ++i) {
            db.addCity(i, cityList1.get(i-1));
        }
        List<City>  cityListDB = db.getCity();
        System.out.println("DB " + cityListDB);
        System.out.println("List2 " + cityList2);


        for (int i = 0; i < cityList2.size(); i++) {
            for (int j = 0; j < cityListDB.size(); j++) {
                if(db.hasID(cityList2, i, cityListDB, j)){
                    db.updateCities( cityList2.get(i));
                } else{
                    db.addCity(i+1, cityList2.get(i));
                }
            }
        }
        System.out.println("DB " + db.getCity());



    }
    public static List<City> generateCountries(int count){
        Random rndm = new Random();
        List<City> list1 = new ArrayList<>();
        String [] countryName = {"Ashgabat",
                "Bishkek",
                "Gypjak",
                "Karaganda",
                "Kashgar",
                "Mazar-i-Sharif",
                "Namangan",
                "Osh",
                "Temirtau"};
        for (int i = 1; i <= count; i++) {
            list1.add(i-1, new City(i, countryName[(int)(Math.random() * countryName.length)]));
        }
        return list1;
    }

}
