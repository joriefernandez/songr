package com.fern.jorie.projectlab.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Album controller class to create or retrieve album info from database.
 * Reference: https://spring.io/guides/gs/handling-form-submission/
 */
@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    // get albums and display using the allAlbums html page
    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        //Create album object based from the form input
        m.addAttribute("album", new Album());

        //Get all albums in the database and display
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";

    }

    // get songs and display using the allAlbums html page
    @GetMapping("/songs")
    public String getAllSongs(Model m){

        //Get all albums in the database and display
        Iterable<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs";

    }

    //Get songs in an album
    @GetMapping("/albums/{id}")
    public String getAlbumSong(@PathVariable long id, Model m){

        m.addAttribute("newSong", new Song());
        Album theAlbum = albumRepository.findById(id).get();
        Iterable<Song> songs = theAlbum.getSongs();
        m.addAttribute("songs", songs);
        m.addAttribute("album", theAlbum );
        return "albumInfo";
    }


    // Add album to database and display to the /albums page
    @PostMapping("/albums")
    public String albumSubmit(@ModelAttribute Album album){
        //save to db
        albumRepository.save(album);
        //redisplay page with the new album
        return "redirect:/albums";

    }

    @PostMapping("/albums/{id}")
    public String addSong(@PathVariable long id, @RequestParam String title, @RequestParam long seconds,
                          @RequestParam int trackNumber, Model m) {
        Album theAlbum = albumRepository.findById(id).get();
        Song theSong = new Song(title, seconds, trackNumber, theAlbum);
        m.addAttribute("newSong", theSong);
       songRepository.save(theSong);
       return "redirect:/albums/{id}";
    }
}


