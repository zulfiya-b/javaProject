package methodOverloading;

public class ArithmeticOperations {

    /* create a method which returns the sum of numbers
    1. takes 2 ints
    2. takes 3 ints

    create a method which returns the average of numbers
    1. takes 4 ints
    2. takes 6 ints


     */

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double average(int a, int b, int c, int d) {
        return (double) (a + b + c + d) / 4;
    }

    public double average(int a, int b, int c, int d, int e, int f) {
        return (double) (a + b + c + d + e + f) / 6;
    }
}






















































