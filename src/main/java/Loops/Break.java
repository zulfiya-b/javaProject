package Loops;

import java.util.Scanner;

public class Break {
    public static void main (String [] args) {

        /*
        create a program that asks user to enter one number and print all numbers up until given number
        but program can only print numbers until 40. 40 is the lilmit.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();

        int limit = 40;
        for (int i = 0; i <= number; i++) {
            System.out.println(i);

            if (i <= 40){
                break; // stop and jump out of loop
            }
            System.out.println(i);
        }
        System.out.println("After loop");



    }



}
