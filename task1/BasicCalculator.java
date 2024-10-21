package task1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        

        while (true) {

            double result;

            
            System.out.println();

            System.out.println("Enter the Operation to perform : 1. Addition 2. Substraction 3.Multipilcation 4.Division 5.Exit");
            int Operation = in.nextInt();

            if(Operation < 1 || Operation >5){
                System.out.println("Please enter value between 1 to 5 according to the operation you need to perform!");
            continue;
            }

            // To come out of the loop
            if(Operation == 5){
                System.out.println("Exiting...");
                in.close();
                break;
            }

            System.out.println("How many input you want to take? ");
            int count = in.nextInt();

            if(count<=0){
                System.out.println("Please enter a valid input (greater than zero)");
                continue;
            }

          

            System.out.print("Enter the first Number: ");
            result = in.nextDouble(); // first input
            count--;
            

            for (int i = 1; i <= count; i++) {

                System.out.print("Enter the " + (i + 1) + " number: ");
                double b = in.nextDouble(); // other inputs
                
            
            // result initially holds 1st input and get updated in each iteration.
            switch (Operation) {
                case 1 -> result += b;
                case 2 -> result -= b;
                case 3 -> result *= b;
                case 4 ->{
                    if(b != 0){
                        result /= b;
                    }else{
                        System.out.println("Division by zero is not allowed");
                        i--; //To re-attempt same iteration
                    }
                }                 
                default -> System.out.println("Invalid Operator!");


            }
        }

            System.out.println("The result is: " + result);
            System.out.println();
            
        
        }
    }
}
