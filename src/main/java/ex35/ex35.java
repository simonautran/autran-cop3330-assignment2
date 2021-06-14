/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex35;
import java.util.ArrayList;
import java.util.Scanner;
public class ex35 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        System.out.print("Enter a name: ");
        String nextName = input.nextLine();
        if (!nextName.equals("")) 
        {
            names.add(newName);
        }
        for (int i = 0; !nextName.equals("") ; i++) 
        {
            System.out.print("Enter a name: ");
            nextName = input.nextLine();
            if (!nextName.equals("")) 
            {
                names.add(nextName);
            }
        }
        int winner = (int) Math.floor(Math.random() * names.size() );
        System.out.println("The winner is... " +names.get(winner)+ ".");
    }
}
