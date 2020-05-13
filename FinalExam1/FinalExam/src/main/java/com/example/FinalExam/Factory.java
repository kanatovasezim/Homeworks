package com.example.FinalExam;


public class Factory {
   public Bookable getBookable(String name){
       Bookable result = null;
       switch (name) {
           case "NAVAT":
               result = new Restaurant();
               break;
           case "BROADWAY":
               result = new Cinema();
               break;
           case "TICKETON":
              result = new Ticket();
               break;
           default:
               throw new IllegalArgumentException("You cannot book:" + name);
       }
       return result;
   }
}
