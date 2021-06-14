/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex37;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex37 
{
    static List<Character> specialCharacters =  List.of( '@', '#', '$', '%', '^', '&', '*' );
    static List<Character> numberCharacters = List.of( '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' );
    static List<Character> alphaCharacters = List.of( 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' );
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();
        System.out.print("How many special characters? ");
        int AmountOfSpecial = input.nextInt();
        System.out.print("How many numbers? ");
        int AmountOfNumbers = input.nextInt();
        String password = GeneratePassword(minLength, SpecNumer, numbersNumber);
        System.out.println("Your password is " + password);
        System.out.println("The length of the password is " + password.length());
    }
    public static String GeneratePassword(int minLength, int AmountOfSpecial, int AmountOfNumbers) 
    {
        StringBuilder password = new StringBuilder();
        int maxLength = (numbersNumber + AmountOfSpecial) * 2;
        while ((password.length() < minLength || password.length() < maxLength) || !(AmountOfNumbers == 0 && AmountOfSpecial == 0)) 
        {
            int rand = (int) Math.floor(Math.random() * 3);
            if (rand == 0 && AmountOfSpecial > 0) 
            {
                password.append(specialCharacters.get((int) Math.floor(Math.random() * specialCharacters.size())));
                AmountOfSpecial--;
            }
            if (rand == 1 && AmountOfNumbers > 0) 
            {
                password.append(numberCharacters.get((int) Math.floor(Math.random() * numberCharacters.size())));
                AmountOfNumbers--;
            }
            if (rand == 2) 
            {
                password.append(alphaCharacters.get((int) Math.floor(Math.random() * alphaCharacters.size())));
            }
        }
        return password.toString();
    }
}
