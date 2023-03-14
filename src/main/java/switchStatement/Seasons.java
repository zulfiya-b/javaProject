package switchStatement;

import java.util.Scanner;

public class Seasons {
    public static void main (String [] args){

        Scanner season = new Scanner(System.in);
        System.out.println("Enter the month from 1 to 12");
        int month = season.nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }

        if (month == 1 || month == 2 || month == 12) {
        System.out.println("Winter");
        }else if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }else if (month == 6 || month == 7 || month == 8)  {
            System.out.println("Summer");
        }else if (month == 9 || month == 10 || month == 11){
            System.out.println("Fall");
        }else {
            System.out.println("Invalid month");
        }

        /* Create a program that asks the user to enter a word and then checks whether the word contains the letter 'e' or not.
        If the word contains 'e', the program should print out the index of the first occurrence of 'e' in the word.
        If the word does not contain 'e', the program should print out "The word does not contain the letter 'e'.
         */



    }

}
