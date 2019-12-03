package com.company;

public class Song {
    private String title;
    private String artist;
    private String lyrics;
    private String genre;

    public Song(String title, String artist, String lyrics, String genre) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return
                "title=" + title + '\n' +
                        "artist=" + artist + '\n' +
                        "lyrics=" + lyrics + '\n' +
                        "genre=" + genre ;
    }
}
