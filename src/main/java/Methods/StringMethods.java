package Methods;

public class StringMethods {

    /* create a method that takes 2 strings and checks if they are same. True, false

     */

    static boolean compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }

    // create a method which takes 2 strings and returns one concatenated string in all upper case
    static String concatenateStrings(String s1, String s2) {
        return (s1 + s2).toUpperCase();

    }
    // create a method which takes 2 strings, concatenate both strings and return the length of concatenated string

    static int getLengthOf2Strings(String s1, String s2) {
        return (s1 + s2).length();
    }
    // create a method which takes int and returns true if integer is even, else return false

    public static boolean isEven(int b) {
        if (b % 2 == 0) {
            return true;
        }
        return false;
    }
    // create a method which takes int and returns true if this int is divisible by 10, else return false


    public static boolean isDivisibleBy10(int num) {
        return num % 10 == 0;
    }

    // create void method, which takes one int and prints out multiplication table of this int

    // 5 * 1 = 5
    // 5 * 2 = 10


    public static void printMultiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }

    // create a method that takes two ints, and return the largest one

    public static int getLargest(int a, int b){
        if (a > b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }

    // create a method which takes 4 ints and returns their average
    // create a method which takes one int , and returns the sum of all numbers starting from 1 up to that int

    //5 => 1 + 2 + 3 + 4 + 5 = 15;

    public static int startFrom1(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum = sum + i;
        }
        return sum;
    }

    }



