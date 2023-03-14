package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // write a program that will ask the user to enter a number and tell if number is prime or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0){
                isPrime = false;
                break;
            }

        }
        if (isPrime){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is Not prime");
        }

    }
    // 0 1 1 2 3 5 8 13 21 - Fibonacci series




}
