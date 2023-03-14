package Loops;

import java.util.Scanner;

public class EvenNumber {
    public static void main (String [] args){

        // keep asking user to enter even number when user enters even number, stop

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter even number: ");
            number = scanner.nextInt();


        } while (number % 2 != 0);



    }




}
