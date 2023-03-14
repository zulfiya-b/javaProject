package Practice;

import java.util.Scanner;

public class isDivisible {
    public static void main (String [] args){


            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int num1 = sc.nextInt();
            if ((num/num1)%2==0){
                System.out.println("Yes its divisible");
            }else {
                System.out.println("No, its not divisible");
            }
    }


}
