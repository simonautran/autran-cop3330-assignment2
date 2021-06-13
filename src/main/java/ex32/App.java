/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
 */
public class App 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int guesses = 1;
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int diff = input.nextInt();
        int number = generateRandomNumber(diff);
        System.out.print("I have my number. What's your guess? ");
        int guess = input.nextInt();
        while (guess != number) 
        {
            if (guess > number) 
            {
                System.out.print("Too high. Guess again: ");
            }
            if (guess < number) 
            {
                System.out.print("Too low. Guess again: ");
            }
            guess = input.nextInt();
            guesses++;
        }
        System.out.println("You got it in " + guesses + " guesses!");
    }
    public static int generateRandomNumber (int diff) 
    {
        double rand = 0;
        if (diff == 1) 
        {
            generate = (Math.random() * ((10 - 1) + 1));
        }
        if (diff == 2) 
        {
            generate = (Math.random() * ((100 - 1) + 1));
        }
        if (diff == 3) 
        {
            generate = (Math.random() * ((1000 - 1) + 1));
        }
        return (int) Math.round(generate);
    }
}
