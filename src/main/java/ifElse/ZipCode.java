package ifElse;

import java.util.Scanner;

public class ZipCode {
    public static void main (String [] args){
        /* Create a program that asks the user to enter a zip code in the format "XXXXX" (where X is a digit) and then
        checks whether the zipcode is valid or not.
        A valid zip code must contain exactly 5 digits and all digits must not contain 9, must not start with 0.
        If the zipcode is valid, the program should print out "The entered zipcode is valid". Otherwise, the program
        should print out "The entered zipcode is invalid".

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digit zipcode");
        int zipcode = scanner.nextInt();
        String zip = zipcode + "";

        if (zip.length() == 5 && !zip.contains("9") && !zip.startsWith("0")) {
            System.out.println("Zip code is valid");
        } else {
            System.out.println("Entered zip code is not valid");
        }


        }

    }





