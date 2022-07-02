package com.bridgelabz;

public class MoodAnalyser {
    //Declare variable
    String mood;
    String message;

    //Default constructor
    public MoodAnalyser(){

    }

    //Parameterised constructor
    public MoodAnalyser(String message){
    this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
    }

    public String analysisMood(String message) {
        if (message.equalsIgnoreCase("I am in sad Mood")) {
            mood = "SAD";
            return mood;
        }
        else {
            mood = "HAPPY";
            return mood;
        }
    }
}
