package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cities> cities = new ArrayList<>();
        HashSet<Cities> citiesHashSet = new HashSet<>();
        TreeSet<Cities> citiesTreeSet = new TreeSet<>();
        Cities c1 = new Cities(1, "Bishkek");
        Cities c2 = new Cities(2, "Tokmok");
        Cities c3 = new Cities(3, "Karakol");
        Cities c4 = new Cities(4, "Osh");
        Cities c5 = new Cities(5, "Talas");
        Cities c6 = new Cities(6, "Naryn");
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);
        cities.add(c6);

        for (Cities c:cities) {
            if (c.getCode() %2 == 0){
                citiesHashSet.add(c);
            }
            else {
                citiesTreeSet.add(c);
            }
        }
//        for (int i = 0; i < cities.size(); i++) {
//            if (cities.get(i).getCode() %2 == 0){
//                citiesHashSet.add(cities.get(i));
//            }
//            else {
//                citiesTreeSet.add(cities.get(i));
//            }
//        }
        System.out.println(citiesTreeSet);
        System.out.println(citiesHashSet);

        Iterator it = citiesTreeSet.iterator();
        while (it.hasNext()) {
            for (Iterator iter = it; iter.hasNext(); ) {
                Cities i = (Cities) iter.next();
                if (i.getName().length() > 5) {
                    it.remove();
                }
            }
        }
       citiesHashSet.removeIf(c -> c.getName().length()>5);
        System.out.println(citiesTreeSet);
        System.out.println(citiesHashSet);

    }}

