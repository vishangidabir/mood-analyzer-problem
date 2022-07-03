package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Create object of MoodAnalyser class
     MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Test case to check sad mood
    @Test
    public void givenMood_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String reaction =moodAnalyser.analysisMood();
        Assert.assertEquals("sad",reaction);
    }

    //Test case to check happy mood
    @Test
    public void givenMood_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String reaction =moodAnalyser.analysisMood();
        Assert.assertEquals("Happy",reaction );
    }

    //Test case to check null mood
    @Test
    public void givenMood_WhenHappy_TroughException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String reaction =moodAnalyser.analysisMood();
        Assert.assertEquals("Happy",reaction );
    }
}
