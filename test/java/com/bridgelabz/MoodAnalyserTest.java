package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    //Create object of MoodAnalyser class
     MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Test case to check sad mood
    @Test
    public void givenMood_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String reaction;
        try {
            reaction = moodAnalyser.analysisMood();
            Assert.assertEquals("sad",reaction);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }

    //Test case to check happy mood
    @Test
    public void givenMood_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String reaction;
        try {
            reaction = moodAnalyser.analysisMood();
            Assert.assertEquals("Happy",reaction );
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }

    }

    //Test case to check Null mood
    @Test
    public void givenMood_WhenNull_TroughException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String reaction;
        try {
            reaction = moodAnalyser.analysisMood();
            Assert.assertEquals("Happy",reaction );
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }

    }
    //Test case to check Empty mood
    @Test
    public void givenMood_WhenEmpty_TroughException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String reaction;
        try {
            reaction = moodAnalyser.analysisMood();
            Assert.assertEquals("Happy",reaction );
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }

    }

}
