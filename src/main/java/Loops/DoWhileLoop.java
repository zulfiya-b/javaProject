package Loops;

public class DoWhileLoop {
    public static void main (String [] args){

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);

        // using do while loop print odd numbers from 1 to 100

        int k = 1;

        do {
            if (k % 2 != 0)
            System.out.println(k);

            k++;
        }while (k <= 100);


    }




}
