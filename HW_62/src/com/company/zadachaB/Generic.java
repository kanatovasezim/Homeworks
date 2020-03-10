package com.company.zadachaB;

import java.util.Collection;


public class Generic<T> {

    public static double sum(Collection<? extends Number> num){
        double sum = 0.0;
        for (Number x: num) {
            sum +=  x.doubleValue() ;
        }
        return sum;
    }
    public static  <T extends Number> double average(T[] array){
        double sum = 0.0;
        double avg = 0.0;
        for (Number x: array) {
            sum +=  x.doubleValue() ;
        }
        avg = sum/(array.length);
        return avg;
    }

}
