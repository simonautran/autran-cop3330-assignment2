/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex24;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String first = input.nextLine();

        System.out.print("Enter the second string: ");
        String second = input.nextLine();

 boolean result = isAnagram(word1, word2);

        if (result) {
            System.out.println(first + " and " + second + " are anagrams.");
        } else {
            System.out.println(first + " and " + second + " are not anagrams.");
        }
    }

  public static boolean isAnagram (String first, String second) {

        char[] string1 = first.toCharArray();
        char[] string2 = second.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }
}
