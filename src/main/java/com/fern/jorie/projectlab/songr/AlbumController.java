package com.fern.jorie.projectlab.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Album controller class to create or retrieve album info from database.
 */
@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    // get albums and display using the allAlbums html page
    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        //Create album object based from the for input
        m.addAttribute("album", new Album());

        //Get all albums in the database and display
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";

    }

    // Add album to database and display to the /albums page
    @PostMapping("/albums")
    public String albumSubmit(@ModelAttribute Album album){
        //save to db
        albumRepository.save(album);
        //redisplay page with the new album
        return "redirect:/albums";

    }
}


