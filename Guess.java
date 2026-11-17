// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Random;
import java.util.Scanner;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        int numGuesses = 1; //Total number of guesses (the first guess counts as 1)
        int tooHigh = 0; //The number of guesses that were too high
        int tooLow = 0; //The number of guesses that were too low

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the number to guess
        numToGuess = generator.nextInt(10) + 1;

        //print message asking user to enter a guess
        System.out.println("Guess a number from 1 to 10: ");

        //read in guess
        guess = scan.nextInt();

        while (guess != numToGuess) //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong

            if (guess > numToGuess) {
                System.out.println("Wrong, your guess is too high.");
                tooHigh++;
            }
            else {
                System.out.println("Wrong, your guess is too low.");
                tooLow++;
            }
            //get another guess from the user
            System.out.print("Try again: ");
            guess = scan.nextInt();
            numGuesses++;
        }
        //print message saying guess is right
        System.out.println("Congratulations, you guessed it!");
        System.out.println("Total guesses: " + numGuesses);
        System.out.println("Guesses too high: " + tooHigh);
        System.out.println("Guesses too low: " + tooLow);
    }
}
