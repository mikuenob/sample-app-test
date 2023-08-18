package org.interswitch.maven.maven;

public class App2 {
    public static void main(String[] args) {
        UpperLowerCase upperLowerCase = new UpperLowerCase();
        System.out.printf("%s to %s", "hello world", upperLowerCase.wordToUpperCase("hello world"));
        System.out.println();
        System.out.printf("%s to %s", "HELLO WORLD", upperLowerCase.wordToLowerCase(" "));
    }
}
