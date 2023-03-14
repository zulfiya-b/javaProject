package Practice;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        int num = scanner.nextInt();

        int num1 = scanner.nextInt();
        System.out.println("Enter second number");

        int num2 = scanner.nextInt();
        System.out.println("Enter third number");

        if (num > num1 && num > num2){
            System.out.println("First number is larger");
        }
        else if (num1 > num && num1 > num){
            System.out.println("second number is larger");
        }
        else if (num1 > num1 && num2 > num){
            System.out.println("third number is larger");
        }
        else{
            System.out.println();
        }









    }
}