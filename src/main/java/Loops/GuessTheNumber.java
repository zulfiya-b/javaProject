package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String [] arg){

        // write a program that generates a random number between 1 to 100 and ask user to enter number,
        // the program should say
        //"Too low, try again" if guessed number is lower,
        // "Too high, try again" if guessed number is higher
        // The program should keep asking for number, until user enters correct number

        int randomNumber = new Random().nextInt(1, 100);

        Scanner user = new Scanner(System.in);

        int number;

        do {
            System.out.println("Enter the number: ");
            number = user.nextInt();
            System.out.println(number);

            if (number < randomNumber){
                System.out.println("Too low");
            } else if (number > randomNumber){
                System.out.println("Too high");
            } else {
                System.out.println("You guessed the right number.");
                break;
            }

            if (number < 1 || number > 100){
                System.out.println("Enter number in range 1-100");
            }
        } while (number != randomNumber);



    }




}
