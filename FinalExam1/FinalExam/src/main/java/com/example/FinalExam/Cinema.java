package com.example.FinalExam;
//(Свойства: Наименование, Адрес, Фирменное Блюдо, Сайт)
public class Cinema implements Bookable {


    String name;
    String address;
    String dish;
    String website;

    @Override
    public void book() {
        System.out.println("You have booked the cinema");
    }
}
