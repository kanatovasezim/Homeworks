package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws ParseException {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date d1 = simpleDateFormat.parse("2020-01-01");
        Date d2 = simpleDateFormat.parse("2020-12-31");


        ArrayList<Weekdays> weekdays = new ArrayList<>();
        LinkedHashMap<Weekdays, Integer> linkedHashMap = new LinkedHashMap<>();
        weekdays.add(new Weekdays("Mon"));
        weekdays.add(new Weekdays("Tu"));
        weekdays.add(new Weekdays("Wed"));
        weekdays.add(new Weekdays("Thur"));
        weekdays.add(new Weekdays("Fri"));
        weekdays.add(new Weekdays("Sat"));
        weekdays.add(new Weekdays("Sun"));
        Calendar c = Calendar.getInstance();
        for (int i = 0; i < 100; i++) {
            Date randomDate = new Date(ThreadLocalRandom.current().nextLong(d1.getTime(), d2.getTime()));
            c.setTime(randomDate);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
            int value = linkedHashMap.getOrDefault(weekdays.get(dayOfWeek), 0);
            linkedHashMap.put(weekdays.get(dayOfWeek), ++value);
        }
        System.out.println(linkedHashMap);

    }
}
