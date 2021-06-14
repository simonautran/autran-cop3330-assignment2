/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex31;
import java.util.Scanner;
public class ex31 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        System.out.print("What is your resting heart rate? ");
        int heartrate = input.nextInt();
        System.out.println("Resting Pulse: 65        Age: 22\n");
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");
        for (double i = 0.55; i < 1; i = i + .05) 
        {
            double bpm = (((220 - age) - heartrate) * i) + heartrate;
            System.out.printf("%.0f%%\t\t\t | %.0f bpm\n", i * 100, bpm);
        }
    }
}
