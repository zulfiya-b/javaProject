package Practice;

import java.util.Scanner;

public class AtLeastTwoTrue {

    public static void main (String [] args){

       /* Write a program that takes in three boolean values a, b, and c, and prints:
        "At least two are true" if at least two of them are true
        "Less than two are true" otherwise.
        "All true" if all 3 are true. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three booleans");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        if (b & a & c){
            System.out.println("all true");
        }else if ((a&&b) || (b&&c) || (c&&a)){
            System.out.println("at least two are true");
        } else {
            System.out.println("at least 2 are not true");
        }

    }


}
