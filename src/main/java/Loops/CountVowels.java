package Loops;

import java.util.Scanner;

public class CountVowels {
    public static void main (String [] args){

        /* write a program that will ask user to enter a string and output the number of vowel that string has.
        Keep asking user to enter string and outputting the number of vowels, until the user enters a string with
        10 vowels.
         */

        Scanner scanner = new Scanner(System.in);
        int counter;
        do {
            System.out.println("Enter a string with 10 vowels:");
            String word = scanner.nextLine();
            counter = 0;

            for (int i = 0; i < word.length(); i++){

                word = word.toLowerCase();

                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o'
                        || word.charAt(i) == 'i' || word.charAt(i) == 'u'){
                    counter++;
                }
            }

            System.out.println("The entered word's vowel count: " + counter);

        }while (counter != 10);

















    }



}
