package Loops;

import java.util.Scanner;

public class Continue {
    public static void main (String [] args){
        // create a program that prints numbers from 1 to 10 if number is equal to 5, do not print

        /*
        for (int y = 1; y <= 10; y++) {
            if (y != 5) {
                System.out.println(y);
            }
        }

        for (int x = 1; x <= 100; x++){
            if (x % 2 == 0){
                continue;
            }
                System.out.println(x);
            }


        /* Ask user to enter one negative and one positive number and print all numbers in that range
           if number is even and negative, do not print it
           if number is odd and positive , do not print it
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one positive number and one negative number: ");
        int negative = scanner.nextInt();
        int positive = scanner.nextInt();

        for (int i = negative; i <= positive; i++){
            if (i < 0 && i % 2 == 0){
                continue;
            }
            else if (i > 0 && i % 2 != 0) {
                continue;
            }
                    System.out.println(i);

            }
             */

        for (int k = 1; k <= 50; k++) {
            if (k % 2 == 1){
                System.out.println(k);
            }
        }





















        }


        }









