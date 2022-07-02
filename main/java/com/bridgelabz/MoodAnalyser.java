package com.bridgelabz;

public class MoodAnalyser {
    String mood;
    public String analysisMood(String message) {
        if (message.equalsIgnoreCase("I am in sad Mood"))
            mood =  "SAD";
        return mood;
    }
}
