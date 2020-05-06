package com.example.FinalExam;

public class Ticket implements Bookable {
    //(Наименование, Сайт, Способы оплаты)
    String name;
    String website;
    PayMethod payMethod;

    @Override
    public void book() {
        System.out.println("You have booked a ticket");
    }
}
