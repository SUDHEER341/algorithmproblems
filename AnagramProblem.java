package com.algorithmproblems;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramProblem {
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the first word to check : ");
        String firstWord = inputScanner.nextLine();
        System.out.print("Enter the second word to check : ");
        String secondWord = inputScanner.nextLine();

        if (isAnagram(firstWord, secondWord))
        {
            System.out.println("The entered strings are anagrams");
        } else {
            System.out.println("The entered strings are not anagrams.");
        }
    }

    public static boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length())
        {
            return false;
        }
        char[] charArr1 = firstString.toCharArray();
        char[] charArr2 = secondString.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }
}

