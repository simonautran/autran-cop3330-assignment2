/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex35;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        System.out.print("Enter a name: ");
        String newName = input.nextLine();
        if (!newName.equals("")) {
            names.add(newName);
        }
        for (int i = 0; !newName.equals("") ; i++) {
            System.out.print("Enter a name: ");
            newName = input.nextLine();
            if (!newName.equals("")) {
                names.add(newName);
            }
        }
        int winner = (int) Math.floor(Math.random() * names.size() );
        System.out.println("The winner is... " + names.get(winner) + ".");
    }
}
