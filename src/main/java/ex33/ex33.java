/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex33;
import java.util.Scanner;
public class ex33 
{
    static String[] arr = {"Yes", "No", "Maybe", "Ask again later."};
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question? ");
        String question = input.nextLine();
        int rand = (int) Math.floor((Math.random() * 5));
        System.out.print("\n"+arr[rand]);
    }
}
