/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
package ex36;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class ex36
{
    public static void main (String[] args)
    {
        results(inputs());
    }
    public static ArrayList<String> inputs()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        boolean flag = true;
        String prompt = "";
        do
        {
            System.out.println("Enter a number: ");
            prompt = sc.nextLine();
            if(prompt.equalsIgnoreCase("done"))
            {
                flag = false;
            }
            try
            {
                Integer.parseInt(prompt);
                numbers.add(prompt);
            }
            catch(Exception e)
            {
            }
        }while(flag);
        return numbers;
    }
    public static double average(ArrayList<String> nums)
    {
        double avg = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            avg += Integer.parseInt(nums.get(i));
        }
       return (avg)/nums.size();
    }
    public static int max(ArrayList<String> nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++)
        {
            if(Integer.parseInt(nums.get(i)) > max)
            {
                max = Integer.parseInt(nums.get(i));
            }
        }
        return (max);
    }
    public static int min(ArrayList<String> nums)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++)
        {
            if(Integer.parseInt(nums.get(i)) < min)
            {
                min = Integer.parseInt(nums.get(i));
            }
        }
        return (min);
    }
    public static ArrayList<String> stdp1(ArrayList<String> nums)
    {
        ArrayList<String> nums2 = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++)
        {
            nums2.add(String.valueOf((int)Math.pow(Integer.parseInt(nums.get(i)) - average(nums),2)));
        }
        return nums2;
    }
    public static double stdp2(ArrayList<String> nums)
    {
        return Math.sqrt(average(nums));
    }
    public static void results(ArrayList<String> nums)
    {
      DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The average is " + df.format(average(nums)));
        System.out.println("The minimum is " + df.format(min(nums)));
        System.out.println("The maximum is " + df.format(max(nums)));
        System.out.println("The standard deviation " + df.format(stdp2(stdp1(nums))));
    }
}
