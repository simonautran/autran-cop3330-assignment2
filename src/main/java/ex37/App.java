/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex37;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    static List<Character> specialCharacters =  List.of( '@', '#', '$', '%', '^', '&', '*' );
    static List<Character> numberCharacters = List.of( '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' );
    static List<Character> alphaCharacters = List.of( 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' );
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();
        System.out.print("How many special characters? ");
        int noOfSpec = input.nextInt();
        System.out.print("How many numbers? ");
        int noOfNumbers = input.nextInt();
        String password = GeneratePassword(minLength, SpecNumer, numbersNumber);
        System.out.println("Your password is " + password);
        System.out.println("The length of the password is " + password.length());
    }
    public static String GeneratePassword(int minLength, int noOfSpec, int noOfNumbers) {
        StringBuilder password = new StringBuilder();
        int maxLength = (numbersNumber + noOfSpec) * 2;
        while ((password.length() < minLength || password.length() < maxLength) || !(noOfNumbers == 0 && noOfSpec == 0)) {
            int rand = (int) Math.floor(Math.random() * 3);
            if (rand == 0 && noOfSpec > 0) {
                password.append(specialChars.get((int) Math.floor(Math.random() * specialChars.size())));
                noOfSpec--;
            }
            if (rand == 1 && noOfNumbers > 0) {
                password.append(numberChars.get((int) Math.floor(Math.random() * numberChars.size())));
                noOfNumbers--;
            }
            if (rand == 2) {
                password.append(alphaChars.get((int) Math.floor(Math.random() * alphaChars.size())));
            }
        }
        return password.toString();
    }
}
