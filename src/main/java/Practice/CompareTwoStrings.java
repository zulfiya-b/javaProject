package Practice;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if (word1.equals(word2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

    }

}
