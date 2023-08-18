package org.interswitch.maven.maven;

public class UpperLowerCase {
    public String wordToUpperCase(String word){
        if (word == null || word.trim().isEmpty())
            throw new IllegalArgumentException("Word cannot be empty");
        String[] words = word.split(" ");
        return word.toUpperCase();
    }

    public String wordToLowerCase(String word){
        if (word == null || word.trim().isEmpty())
            throw new IllegalArgumentException("Word cannot be empty");
        String[] words = word.split(" ");
        return word.toLowerCase();
    }

}
