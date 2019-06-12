package com.fern.jorie.projectlab.songr;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class HelloWorldTest {

    HelloWorldController test;
    @Before
    public void initialize(){
        test = new HelloWorldController();
    }

    //Test capitalize with small case
    @Test
    public void testCapitalize(){
        assertEquals("Should capitalize the parameter", "HELLO", test.capitalize("hello"));
    }

    //Test capitalize with first case capitalized
    @Test
    public void testCapitalize1(){
        assertEquals("Should capitalize the parameter", "THIS IS SAMPLE.", test.capitalize("This is sample."));
    }

    //Test capitalize with first case capitalized
    @Test
    public void testCapitalizeAllCapitalized(){
        assertEquals("Should capitalize the parameter", "ALL CAPITAL.", test.capitalize("ALL CAPITAL."));
    }

    //Test capitalize null
    @Test
    public void testCapitalizeNull(){
        assertNull("Should capitalize the parameter",  test.capitalize(null));
    }

    //Test reverse with one word
    @Test
    public void testReverseOne(){
        assertEquals("Should reverse the word", "hello", test.reverse("hello"));
    }

    //Test reverse with one sentence
    @Test
    public void testReverseWords(){
        assertEquals("Should reverse the word", "sentence whole the", test.reverse("the whole sentence"));
    }

    //Test reverse with one sentence
    @Test
    public void testReverseNull(){
        assertNull("Should reverse the word", test.reverse(null));
    }
}
