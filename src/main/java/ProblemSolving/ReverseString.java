package ProblemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main (String [] args){

        /* apple ==> elppa

        create scanner and get string from the user
        create string word = comes from scanner
        create string reversedWord = "";
        loop through the word from end to begin
        reversed+= and get the char
         */

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("chto to");
        String str1 = scanner.next();
        String reversed = "";
        for (int i = str1.length()-1; i >= 0; i--){
            reversed += str1.charAt(i);

        }
        System.out.println(reversed); */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("raspberry");
        String str2 = scanner1.next();
        String reversedWord = "";
        for (int k = str2.length()-1; k >= 0; k--){
            reversedWord = reversedWord + str2.charAt(k);
        }
        System.out.println(reversedWord);









    }




}
