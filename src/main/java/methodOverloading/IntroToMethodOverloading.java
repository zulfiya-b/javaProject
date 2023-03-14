package methodOverloading;

public class IntroToMethodOverloading {

    // Method names must be unique. We cannot have two or more methods to use the same name

    public int getAreaOfRectangle(int length, int width) {
        return length * width;
    }

    public int getAreaOfRectangle(long length, int width) {
        return (int) (length * width);
    }

    public int getPerimeterOfSquare(long side) {
        return (int) (4 * side);
    }

    // create a method that accepts one number and returns true if it's prime, else false
    /* user must be able to give:
    int
    short
    long

     */

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }

    public boolean isPrimeNumber(short number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;


    }
}
