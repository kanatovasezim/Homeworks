package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<AbstractAnimal> listA = new LinkedList<>();
        for (int i = 1; i < 51; i++) {
            listA.add(new Cat("Cat", i));
            listA.add(new Dog("Dog", i));
        }
        int count = 0;
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) instanceof Cat){
                count++;
                if (count==5){
                    listA.remove(i);
                    count = 0;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) instanceof Dog){
                counter++;
                if (counter==3){
                    listA.add(i+1,new Mouse("Mouse", 3));
                    counter = 0;
                }
            }
        }
        System.out.println("Linked list: " +listA);
        System.out.println(listA.size());
        LinkedList<AbstractAnimal> listB = new LinkedList<>();
        ArrayList<AbstractAnimal> listArray = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listArray.add( listA.get(i));
        }
        System.out.println("Array List: " + listArray);
        System.out.println(listArray.size());
        for (int i = 0; i < listA.size(); i++) {
            if (((listA.get(i) instanceof Cat) && (listA.get(i+1) instanceof Mouse)) || ((listA.get(i) instanceof Mouse) && (listA.get(i+1) instanceof Cat))){
                listB.add(listA.get(i));
                listA.remove(i);
                listB.add(listA.get(i+1));
                listA.remove(i+1);
            }
        }

        System.out.println(listA);
        System.out.println(listA.size());
        int cC = 0;
        int cD = 0;
        int cM = 0;
        for(int i =0 ; i < listA.size(); i++){
            if (listA.get(i) instanceof Cat){
                cC += listA.get(i).getAge();
            }else if (listA.get(i) instanceof Dog){
                cD += listA.get(i).getAge();
            }else{
                cM += listA.get(i).getAge();
            }
        }
        System.out.println(cC + " " + cD + " " + cM);
        LinkedList<AbstractAnimal> listC = new LinkedList<>();
        for (AbstractAnimal a : listA){
            if (a instanceof Dog){
                listC.add(a);
            } else if (a instanceof Cat){
                listC.addFirst(a);
            }
        }
        for (AbstractAnimal a : listA){
            if (a instanceof Mouse){
                listC.addLast(a);}
        }

        System.out.println(listC);
    }
}
