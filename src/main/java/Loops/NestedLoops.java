package Loops;

public class NestedLoops {
    public static void main (String [] args){
        // nested loop - loop inside loop

       for (int i = 1; i <= 10; i++){
           for (int j = 1; j <= 10; j++){
               System.out.print((i * j) + " \t");
           }
           System.out.println();
       }

       for (int i = 1; i <= 100; i++) {
           for (int j = 1; j <= 100; j++) {
               System.out.print((i * j) + " \t");
           }
           System.out.println();
       }

       for (int row = 1; row <= 6; row++ ) {
           for (int numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
               System.out.print("* ");
           }
           System.out.println();
       }

       int rows = 5;
       for (int i = 1; i <= rows; i++){
           for (int j = rows - i; j >= 1; j-- ){
               System.out.println(" ");
           }
           for (int k = 1; k <= i; k++) {
               System.out.print("* ");
           }
           System.out.println();
       }

    }




}
