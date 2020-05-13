package com.example.FinalExam;


public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Bookable restaurant = factory.getBookable("NAVAT");
        Bookable cinema = factory.getBookable("BROADWAY");
        Bookable ticket = factory.getBookable("TICKETON");

        restaurant.book();
        cinema.book();
        ticket.book();
    }
}
