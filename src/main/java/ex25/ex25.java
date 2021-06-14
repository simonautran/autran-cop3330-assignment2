/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex25;
import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) {
        String a = prompt();
        response(a);
    }
    public static String prompt(){
        System.out.println("Enter a new password");
        return input();
    }
    public static void response(String a){
        if(passwordValidator(a) <= 1){
            System.out.println("The password '"+ a + "' is a very weak password.");
        }
        else if(passwordValidator(a) == 2 || passwordValidator(a) == 3){
            System.out.println("The password '"+ a + "' is a weak password.");
        }
        else if(passwordValidator(a) == 4){
            System.out.println("The password '"+ a + "' is a strong password.");
        }
        else if(passwordValidator(a) == 5){
            System.out.println("The password '"+ a + "' is a very strong password.");
        }
    }
    public static int passwordValidator(String a){
        int returnVal = 0;
        if(a.length() >= 8){
            returnVal++;
        }
        boolean hasSpecials = false;
        boolean hasDigits = false;
        boolean hasLetters = false;

        s.toLowerCase();
        char[] array1 = a.toCharArray();
        for(int i = 0; i < a.length(); i++)
        {
            if(java.lang.Character.isDigit(array1[i])){
                hasDigits  = true;
            }
            if(java.lang.Character.isLetter(array1[i])){
                hasLetters = true;
            }
            if((array1[i] < 65 && array1[i] > 57) ||  (array1[i] < 127 && array1[i] > 122) || (array1[i] < 97 && array1[i] > 90) || (array1[i] < 48 && array1[i] > 32)){
                hasSpecials  = true;
            }
        }
        if(hasSpecials == true){
            returnVal++;
        }
        if(hasDigits == true){
            returnVal++;
        }
        if(hasLetters == true){
            returnVal += 2;
        }
        return returnVal;
    }
    public static String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
