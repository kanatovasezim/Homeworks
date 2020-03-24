package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        String [] strings = {"Lenovo", "Asus", "Hp", "Apple", "Microsoft", "Xiaomi", "Acer", "Hewlett Packard", "Razer", "Another"};
        for (int i = 1; i < 11; i++) {
            list.put(i, strings[i-1]);
        }
        System.out.println("Task1");
        list.keySet().stream().filter(x -> x>5).forEach(x-> System.out.print(x + "=" + list.get(x) + " "));
        System.out.println();
        System.out.println("Task2");
        list.keySet().stream().filter(x -> x%3==0).forEach(x-> System.out.print(x + "=" + list.get(x) + " "));
        System.out.println();
        System.out.println("Task3");
        Optional<Integer> result = list.entrySet().stream().filter(x -> x.getValue().length()>5).map(x-> x.getKey()).reduce((x,y)-> {return x*y;});
        System.out.println(result.get());

    }
}
