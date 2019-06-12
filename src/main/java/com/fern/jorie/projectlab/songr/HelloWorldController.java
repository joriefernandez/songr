package com.fern.jorie.projectlab.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Controller for the Songr Application.
 */

@RestController
public class HelloWorldController {

    /**
     * Print hello world to local:8080/hello
     * @return
     */
    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello, world!";
    }

    /**
     * Capitalize parameter attached to capitalize route
     * @param param string to capitalize
     * @return capitalized string
     */
    @GetMapping("/capitalize/{param}")
    public String capitalize(@PathVariable String param){
        if(param != null){
            return param.toUpperCase();
        }
        return null;
    }

    /**
     * Reverse words given to the query parameter for route reverse
     * @param sentence words to be reversed
     * @return reversed words
     */
    @GetMapping("/reverse")
    public String reverse(@RequestParam String sentence){
        if(sentence != null) {
            //Split the sentence and store as a list
            List<String> splitSentence = new ArrayList<>(Arrays.asList(sentence.split("\\s")));
            //Reverse the lists
            Collections.reverse(splitSentence);
            //Join the whole sentence
            StringBuilder result = new StringBuilder();
            for (String str : splitSentence) {
                result.append(str);
                result.append(" ");
            }
            return result.toString().trim();
        }
        return null;
    }
}
