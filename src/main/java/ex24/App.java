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
        String one = input.nextLine();

        System.out.print("Enter the second string: ");
        String two = input.nextLine();

 boolean result = isAnagram(word1, word2);

        if (result) {
            System.out.println(one + " and " + two + " are anagrams.");
        } else {
            System.out.println(one + " and " + two + " are not anagrams.");
        }
    }

  public static boolean isAnagram (String one, String two) {

        char[] string1 = one.toCharArray();
        char[] string2 = two.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }
}
