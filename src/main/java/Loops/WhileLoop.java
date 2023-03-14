package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main (String [] args){

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        int y = 1;
        while (y <= 100){
            if (y % 2 == 0){
            System.out.println(y);
            }
            y++;
        }
        int x = 1;
        while (x <= 10) {
            System.out.println("Good morning everyone!");
            x++;
        }
        // print only odd numbers from 100 to 1

        int k = 100;
        while (k >= 1) {
            if (k % 2 != 0) {
            System.out.println(k);

            } k--;
        }

        int d=1;
         while (d <= 31) {
        System.out.println(d+"february 2023");
        d++;
         }

         //write a program that will print true if number is prime, else false - using while loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

       boolean isPrime = true;

       int iterator = 2;

       while (iterator < number){
           if (number % iterator == 0){
               isPrime = false;
           }
           iterator++;
       }
        if (isPrime){
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }



    }



}
