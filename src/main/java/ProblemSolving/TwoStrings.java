package ProblemSolving;

import java.util.Scanner;

public class TwoStrings {
    public static void main (String [] args){

        // print appleBanana

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));

        //print leNa

        word1 = word1.toUpperCase();
        word2 = word2.toLowerCase();

        System.out.println(word1.substring(word1.length()-2) + word2.substring(word2.length()-2));

        System.out.println(word1.toUpperCase().charAt(word1.length()-2) + "" +  word1.toLowerCase().charAt(word1.length() -1) +
                word2.toUpperCase().charAt(word2.length() -2) + "" + word2.charAt(word2.length() -1));






    }



}
