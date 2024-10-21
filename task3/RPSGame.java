package task3;

import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userChoice = UserChoice(in);
        

  
        // Only proceed if user choice is valid
        if (userChoice != null) {
            String sysChoice = ComputerChoice();
    
            System.out.println("Player choice: " + userChoice);
            System.out.println("Computer choice: " + sysChoice);
    
            CheckChoice(userChoice, sysChoice);
        } else {
                System.out.println("Game over due to invalid input.");
            }
        }
 
    

    static String UserChoice(Scanner in){
         String choice = null;
         System.out.println("Enter Your Choice: 1.Rock 2.Paper 3.Scissor");
         int ch = in.nextInt();
         
         switch (ch) {
            case 1 -> choice = "Rock";
            case 2 -> choice = "Paper";
            case 3 -> choice = "Scissor";
            default -> System.out.println("Invalid choice!");
        }
         return choice;
    }

    static String ComputerChoice(){
        Random rand = new Random();
        String Str1 = "Rock";
        String Str2 = "Paper";
        String Str3 = "Scissor";
        String[] randStrings = {Str1,Str2,Str3};
        String compChoice = randStrings[rand.nextInt(3)]; 
        return compChoice;
    }

    static void CheckChoice(String userChoice,String sysChoice){

        if(userChoice .equals(sysChoice)){
               System.out.println("It's a Tie!");
        }
        else if(sysChoice .equals("Rock") && userChoice .equals("Paper")){
               System.out.println("Player Wins");
        }
        else if(sysChoice .equals( "Paper") && userChoice .equals("Scissor")){
            System.out.println("Player Wins");
        }
        else if (sysChoice .equals( "Scissor") && userChoice .equals("Rock")){
            System.out.println("Player Wins");
        }
        else if((sysChoice .equals( "Paper") && userChoice .equals( "Rock"))||(sysChoice .equals( "Scissor") && userChoice .equals("Paper"))||(sysChoice .equals( "Rock") && userChoice .equals("Scissor"))){
            System.out.println("Computer Wins");
        }

    }
}
