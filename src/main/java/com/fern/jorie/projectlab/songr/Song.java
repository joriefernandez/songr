package com.fern.jorie.projectlab.songr;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    long seconds;
    int trackNumber;

    @ManyToOne
    Album album;

    public Song(){}

    public Song(String title, long seconds, int trackNumber, Album album) {
        this.title = title;
        this.seconds = seconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getSeconds() {
        return seconds;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    //Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
