/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex28;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
            sum += array[i];
        } 
        for (int j = 0;j < 5;j++){
            sum += array[j];
        }
        System.out.println("The total is " + sum + ".");
    }
}
