package com.company;

import java.util.Random;

public class LetterReplacement {

    private static Random rand = new Random();

    public static String consonants = "bcdfghjklmnpqrstvwxyz";
    public static String vowels = "aeiou";

    public static void main(String[] args) {
        for (char c : args[0].toCharArray()) {
            char out;
            switch (c) {
                case 'c':
                    out = randomChar(consonants.toCharArray());
                    break;
                case 'v':
                    out = randomChar(vowels.toCharArray());
                    break;
                case 'C':
                    out = randomChar(consonants.toCharArray());
                    break;
                case 'V':
                    out = randomChar(vowels.toCharArray());
                    break;
                default:
                    throw new RuntimeException("Input must consist of these characters: cCvV");
            }
            System.out.print(out);
        }
        System.out.println();
    }

    // method to return random char in a string
    public static char randomChar(char[] characters) {
        return characters[rand.nextInt(characters.length - 1)];
    }
}
