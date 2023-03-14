package ProblemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        /* write a logic, that print "Palindrome" if word is palindrome
        "Not palindrome", if not

        Palindrome is a word that is read same backwards
        civic, madam, level, refer, mom

        apple - not palindrome

        1. reverse string, store in some other string
        2. check if word and reversed word are equal
        3. if true palindrome, else not palindrome


         */
        int length = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) == word.charAt(length-1-i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);









                }

            }

