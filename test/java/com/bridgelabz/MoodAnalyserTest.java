package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Create object of MoodAnalyser class
    public static MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Test case to check sad mood
    @Test
    public void givenMood_WhenSad_ShouldReturnSad(){
        String reaction = "I am in Sad Mood";
        String mood = moodAnalyser.analysisMood(reaction);
        Assert.assertEquals("SAD",mood);
    }
}
