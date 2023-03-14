package Practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data");
        String str = scanner.nextLine();

        System.out.println(str.replace(" ", ""));



    }



}
