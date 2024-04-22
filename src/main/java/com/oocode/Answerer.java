package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        return switch (question) {
            case "What is your name?" -> "Kader";
            case "When were you born?" -> "1994";
            case "Where did you born?" -> "Turkey";
            case "What is your nationality?" -> "Turkey";
            case "What is your citizenship?" -> "British";
            default -> ("I cannot answer the question: " + question);
        };
    }
}