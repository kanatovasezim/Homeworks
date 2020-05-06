package com.example.FinalExam;

public class Restaurant implements Bookable {
    //(Наименование, Вместимость, Адрес, Сайт)
    String name;
    Integer capacity;
    String address;
    String website;

    @Override
    public void book() {
        System.out.println("You have booked a restaurant");
    }
}
