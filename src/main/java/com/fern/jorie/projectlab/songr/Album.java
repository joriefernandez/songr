package com.fern.jorie.projectlab.songr;

import javax.persistence.*;
import java.util.List;

/**
 * Album class that contains album info. Ensure to create getters and setters.
 */

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    long length;
    String imageUrl;

    @OneToMany(mappedBy = "album")
    List<Song> songs;

    //Constructors

    public Album(){}

    public Album(long id, String title, String artist, int songCount, long length, String imageUrl) {

        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    //Getters

    public long getId(){return id;}
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public long getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Song> getSongs(){ return songs;}

    //Setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
