package Loops;

import java.util.Scanner;

public class PracticeBreakContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one positive number and one negative number");
        int negative = scanner.nextInt();
        int positive = scanner.nextInt();

        for (int i = negative; i <= positive; i++){
            if (i < 0 && i % 2 == 0){
                continue;
            }
            else if (i > 0 && i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }



























    }
























}
