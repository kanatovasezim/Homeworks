package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalStateException, IOException {
        FileWriter fileWriter = new FileWriter("test.txt");
        FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\Structural Programming\\Homeworks\\HW_33\\src\\com\\company\\Main.java");
        Scanner sc = new Scanner(fileReader);
        String text = "";
        for (int i = 0;sc.hasNextLine() ; i++) {
            String line = sc.nextLine();
            fileWriter.write(line +"\n");
            text += line + "\n";
        }
        fileWriter.close();
        fileReader.close();

        File file= new File("test.txt");
        try{
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            else if(file.length()>100)
                throw new IllegalStateException("Код слишком большой");
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        }

        FileWriter fileWriter1=new FileWriter("test2.txt");
        text = text.replaceAll("\\s+", "");
        fileWriter1.write(text);
        fileWriter1.close();
    }
}
