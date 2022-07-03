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

    //Method that return mood
    public String analysisMood() throws MoodAnalyzerException {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
            } catch(NullPointerException e) {
            throw new MoodAnalyzerException("Please Enter proper message");
            }
        }
    }