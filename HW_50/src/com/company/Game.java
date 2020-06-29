package com.company;

import java.util.Random;

public class Game implements Runnable {
    @Override
    public void run() {
        Random rndm = new Random();
        int max = 15;
        int min = 0;
        System.out.println("Scored: " + rndm.nextInt((max - min) + 1));
        System.out.println("Yellow: " + rndm.nextInt((max - min) + 1));
        System.out.println("Offside: " + rndm.nextInt((max - min) + 1));
    }
}
