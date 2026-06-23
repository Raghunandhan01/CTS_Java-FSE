package com.example;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logger 1: Hey logger 1 here");
        
        Logger logger2 = Logger.getInstance();
        logger2.log("Logger 2:Hey logger 2 here");
        
        boolean areSame = (logger1 == logger2);
        String result = areSame ? "True" : "False";
        System.out.println("Both are same ? " + result);
    }
}
