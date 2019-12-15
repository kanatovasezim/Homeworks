package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
//    Создать Класс Собака
//    Добавить в Set 40 Далматинцев
//    Не допускать добавления одинаковых далматицев (имя и вес отличаются).
//    Сделать так чтобы далматинцы рассказали о себе.

    public static void main(String[] args) {
        int min = 1;
        int max = 33;
        ArrayList<Dog> dogsArray = new ArrayList<>();
        HashSet<Dog> dogHashSet = new HashSet<>();
        DogName[] dogsName = DogName.values();
        System.out.println(dogsName.length);
        Random rndm = new Random();
        for (int i = 0; i < 40; i++) {
            dogsArray.add(new Dog(dogsName[rndm.nextInt(((max - min) + min) + 1)],rndm.nextInt(((max - min) + min) + 1)));
        }
        System.out.println(dogsArray);
        System.out.println(dogsArray.size());
        for (int i = 0; i <dogsArray.size(); i++) {
            dogHashSet.add(dogsArray.get(i));
        }
        System.out.println(dogHashSet);
        System.out.println(dogHashSet.size());
    }
}
