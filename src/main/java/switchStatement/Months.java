package switchStatement;

import java.util.Scanner;

public class Months {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else {
            System.out.println("Invalid number");
        }

        //String month = "three";

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Invalid");

        }



        }


    }

