package ProblemSolving;

import java.util.Scanner;

public class Apple {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string");
        String str2 = scanner.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str2 = str2.toUpperCase().charAt(0) + str2.substring(1);
        str1 = str1.toUpperCase().charAt(0) + str1.substring(1);

        System.out.println(str1 + str2);


       /* Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        word1.toLowerCase();
        word2.toLowerCase();

        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1) ); */





    }






}
