/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex27;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        System.out.print("Enter your last name: ");
        String last = input.nextLine();
        System.out.print("Enter your zip code: ");
        String zip = input.nextLine();
        System.out.print("Enter your employee ID: ");
        String ID = input.nextLine();
    }
    public void validateInput(String first, String last, String zip, String ID) 
    {
        if (validateFirstName(first) && validateLast(last) && validateZip(zip) && validateID(ID)) 
        {
            System.out.println("There were no errors found.");
        }
    }
    public boolean validateFirst(String first) 
    {
        if (first.length() < 2) 
        {
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        return true;
    }
    public boolean validateLast(String last) 
    {
        if (last.length() < 2) 
        {
            System.out.println("The last name must be at least 2 characters long.");
            if (last.isEmpty()) System.out.println("The last name must be filled in.");
            return false;
        }
        return true;
    }

    public boolean validateZip (String zip) 
    {
      
        char[] zip = zip.toCharArray();

        for (int i = 0; i < zip.length(); i++) 
        {
            if (!Character.isDigit(zip[i]) || zip.length() < 5) 
            {
                System.out.println("The zipcode must be a 5 digit number.");
                return false;
            }
        }
        return true;
    }
    public boolean validateID (String ID) 
    {
        char[] ID = ID.toCharArray();
        boolean valid = true;
        if (!Character.isLetter(ID[0]) || !Character.isLetter(ID[1])) valid = false;
        if (ID[2] != '-') valid = false;
        for (int i = 3; i < ID.length; i++) 
        {
            if (!Character.isDigit(ID[i])) valid = false;
        }
        if (!valid) 
        {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        return valid;
    }
}
