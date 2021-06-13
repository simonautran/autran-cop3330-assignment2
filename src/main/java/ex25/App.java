/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex25;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = in.next();
        if(passwordValidator(password) < 1){
            System.out.println("The password "+password+" is a very weak password.");
        }
        else if(passwordValidator(password) < 2){
            System.out.println("The password "+password+" is a weak passsword.");
        }
        else if(passwordValidator(password) < 3){
            System.out.println("The password "+password+" is a strong password.");
        }
        else System.out.println("The password "+password+" is a very strong password.");
    }
    public static int passwordValidator(String password){
        int iPasswordScore = 0;
        if( password.length() < 8 )
            return 0;
        else if( password.length() >= 10 )
            iPasswordScore += 2;
        else
            iPasswordScore += 1;
        if( password.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;

        return iPasswordScore;
    }
}
