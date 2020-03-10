package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	Thread teamA = new Thread(new TeamA());
	Thread teamB = new Thread(new TeamB());
	teamA.start();
	teamA.sleep(100);
	teamB.start();
    }
}
