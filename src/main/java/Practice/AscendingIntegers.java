package Practice;

import java.util.Scanner;

public class AscendingIntegers {
    public static void main (String [] args){

        Scanner aa = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = aa.nextInt();

        System.out.println("Enter second number");
        int b = aa.nextInt();

        System.out.println("Enter third number");
        int c = aa.nextInt();


        if (a > b && a > c) {
            if (b > c){
                System.out.println("Ascending order: " + c + ", " + b + ", " + a);
                System.out.println("Descending order: " + a + ", " + b + ", " + c);
            }
            else {
                System.out.println("Ascending order: " + b + ", " + c + ", " + a);
                System.out.println("Descending order: " + a + ", " + c + ", " + b);
            }
        }

        else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Ascending order: " + c + ", " + a + ", " + b);
                System.out.println("Descending order: " + b + ", " + a + ", " + c);            }
            else {
                System.out.println("Ascending order: " + a + ", " + c + ", " + b);
                System.out.println("Descending order: " + b + ", " + c + ", " + a);            }
        }

        else {
            if (b > a) {
                System.out.println("Ascending order: " + a + ", " + b + ", " + c);
                System.out.println("Descending order: " + c + ", " + b + ", " + a);            }
            else {
                System.out.println("Ascending order: " + b + ", " + a + ", " + c);
                System.out.println("Descending order: " + c + ", " + a + ", " + b);            }
        }
    }


}
