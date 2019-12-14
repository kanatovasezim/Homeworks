package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rndm = new Random();
        int max = 2;
        int min = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = rndm.nextInt((max - min) + min);
            linkedList.add(rndm.nextInt((max - min) + min));
            arrayList.add(rndm.nextInt((max - min) + min));
        }
        for (int a : array){
            System.out.print(a + " ");
        }
        int temp = 0;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println();
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(linkedList);
        int temp1 = 0;
        for (int i = 0; i < linkedList.size() -1; i++) {
            for (int j = 0; j < linkedList.size() - i -1; j++) {
                if ( linkedList.get(j)> linkedList.get(j+1)){
                    temp1 = linkedList.get(j);
                    linkedList.set(j, linkedList.get(j+1)) ;
                    linkedList.set(j+1, temp1);
                }
            }
        }
        System.out.println();
        System.out.println(linkedList);
        System.out.println();
        System.out.println(arrayList);
        int temp2 = 0;
        for (int i = 0; i < arrayList.size() -1; i++) {
            for (int j = 0; j < arrayList.size() - i -1; j++) {
                if ( arrayList.get(j)> arrayList.get(j+1)){
                    temp2 = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1)) ;
                    arrayList.set(j+1, temp2);
                }
            }
        }
        System.out.println();
        System.out.println(arrayList);
    }
}
