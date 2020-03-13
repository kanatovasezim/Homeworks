package com.company;

public class Main {

    public static void main(String[] args) {
//        Factorial lyambda = (n) -> {
//            Integer result = n;
//            for (int i = n-1; i > 1; i--) {
//                result *= n;
//            }
//            return  result;
//        };
//        System.out.println(lyambda.factor(5));
        Root lyambda2 = (n, x) -> {
            Integer result = 1;
            Integer number = x;
            for (int i = x; i > 1; i--) {

                for (int j = 0; j < n; j++) {
                    result = result * i;
                }
                if (result == number) {
                    return i;
                }
                result = 1;
            }
            return result;
        };
        System.out.println(lyambda2.takeRoot(4,81));
    }
}
