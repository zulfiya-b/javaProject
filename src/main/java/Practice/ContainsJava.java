package Practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main (String [] args){

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1%num2 == 0){
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }

        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boolean: true/false");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter second boolean: true/false");
        boolean b = scanner.nextBoolean();


        if (a && !b){
            System.out.println("A is true and B is false");
        }

        if (!a && b){
            System.out.println("A is false and B is true");
        }

        if (a && b){
            System.out.println("Both A and B are true");
        }

        if (a || b){
            System.out.println("Either a or b is true");
        }

        if (!a && !b){
            System.out.println("Both a and b are false");
        }



    }



}
