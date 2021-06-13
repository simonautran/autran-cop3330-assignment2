/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex34;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = { "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };
        System.out.println("There are " + names.length + " employees:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.print("\nEnter an employee name to remove: ");
        String removedName = input.nextLine();
        String[] newNames = new String[names.length - 1];
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals(removedName)) {
                newNames[pos] = names[i];
                pos++;
            }
        }
        System.out.println("\nThere are " + newNames.length + " employees:");

        for (int i = 0; i < newNames.length; i++) {
            System.out.println(newNames[i]);
        }
    }
}
