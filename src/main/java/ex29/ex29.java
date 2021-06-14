/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex29;
import java.util.Scanner;
public class ex29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rate = "0";
        while (rate.equals("0")) {
            System.out.print("What is the rate of return?");
            rate = input.nextLine();
            char[] arr = rate.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (!Character.isDigit(arr[i]) || rate.equals("0")) {
                    System.out.println("Sorry. That's not a valid input.");
                    rate = "0";
                    break;
                }
            }
        }
        int Returnrate = Integer.parseInt(rate);
        int years = 72 / Returnrate;
        System.out.println("It will take "+years+" years to double your initial investment.");
    }
}
