package ScannerClass;

import java.util.Scanner;

public class Multiplication {

    public static void main (String [] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            int num3 = sc.nextInt();

            System.out.println("Enter second number:");
            int num4 = sc.nextInt();

            System.out.println("Enter third number:");
            int num5 = sc.nextInt();

            System.out.println("The product:" + (num3 * num4 * num5));


    }
}
