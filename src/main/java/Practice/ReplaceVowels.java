package Practice;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main (String [] args){

        /*
        write a program that asks the user to enter a sentence, and then outputs the sentence with all vowels
        replaced by the letter 'x'.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("[aieuyoAIEYOU]", "X");

        System.out.println(sentence);

    }

}
