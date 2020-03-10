package com.company.zadachaB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generic calculations = new Generic();
        Double[] doubles = {2.0, 3.0, 5.0, 2.0};
        Integer[] integers = {2,3,5,2};
        System.out.println(Generic.sum(Arrays.asList(doubles)));
        System.out.println(Generic.average(doubles));
    }

}
