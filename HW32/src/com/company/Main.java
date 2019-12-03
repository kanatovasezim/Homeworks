package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //// ZADACHA A
        FileReader fileReader = new FileReader("Perfect.txt");
        Scanner sc = new Scanner(fileReader);
        String title = "", genre = "", artist = "", lyrics = "";
        for (int i = 1; sc.hasNextLine(); i++){
            String line = sc.nextLine();
            if (i == 1){
                title = line;
            } else if (i == 2){
                genre = line;
            } else  if (i == 3){
                artist = line;
            } else
                lyrics =  lyrics + "\n" + line;

        }
        fileReader.close();
        Song song = new Song(title, artist,lyrics, genre);
        System.out.println(song);
        //// ZADACHA B

        FileWriter fileWriter = new FileWriter("Perfect1.txt");
        fileWriter.write(song.getTitle() + "\n");
        fileWriter.write(song.getGenre() + "\n");
        fileWriter.write(song.getArtist() + "\n");
        fileWriter.write(song.getLyrics());
        fileWriter.close();
    }
}
