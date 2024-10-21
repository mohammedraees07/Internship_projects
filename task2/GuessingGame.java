package task2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 100. Can you guess it correctly?");
        System.out.println("Let's get started!\n");

        int numberToGuess = generateRandomNumber(); 
        int[] tries = {0}; // initialize tries to zero

        playGame(numberToGuess, tries, in);

    }

    static void playGame(int numberToGuess, int[] tries, Scanner in) {
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            int guess = userGuess(in); // Redirect to userGuess method to take user input
            hasGuessedCorrectly = checkGuess(numberToGuess,guess, tries); // To check whether the guess is correct or not it goes to check guess method
        }
    }

    static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    static int userGuess(Scanner in) {
        System.out.print("Enter your guess: ");
        return in.nextInt();
    }

    static Boolean checkGuess(int numberToGuess, int guess, int[] tries) {
        tries[0]++; // Tries gets incremented as we enter our  guesses. 
   
        if (guess > numberToGuess) {
            System.out.println("Too high! Try again");
        } else if (guess < numberToGuess) {
            System.out.println("Too low! Try again");
        } else {
            System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + tries[0] + " tries");
            return true;
        }
        return false;
    }
}
