/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex26;
import java.util.Scanner;
public class ex26 extends PaymentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = input.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = (input.nextDouble() / 100) / 365;
        System.out.print("What is the monthly payment you can make? ");
        double monthPayment = input.nextInt();
        double monthPayOff = PaymentCalculator(balance, APR, monthPayment);
        System.out.printf("It will take you %.0f months to pay off this card.", monthPayOff);
    }
}
