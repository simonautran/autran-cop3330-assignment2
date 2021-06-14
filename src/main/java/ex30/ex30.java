/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex30;
public class ex30 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 12; i++) 
        {
            for (int j = 1; j <= 12; j++) 
            {
                if (j <= 11) 
                {
                System.out.print("\t" + i * j);
                }
                if (j == 12) 
                {
                    System.out.print("\t" + i * j + "\n");
                }
            }
        }
    }
}
