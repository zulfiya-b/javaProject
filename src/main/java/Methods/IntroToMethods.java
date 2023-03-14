package Methods;

public class IntroToMethods {

    String getCapitalofFrance() {

        // here you can write any code
        return "Paris";
        // you cannot write any code after return
    }

    double getPI() {
        return 3.14;
    }

    int getZero() {
        return 0;
    }

    char getLetter() {
        return 'a';
    }

    double getAreaofRectangle(double length, double width) {
        return length * width;
    }

    // create method to get perimetere of triangle

    int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    // create a method that takes a string as parameter and returns the length of the string

    int getLengthOfString(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        IntroToMethods intro = new

                IntroToMethods(); // creating object
        System.out.println(intro.getAreaofRectangle(5.4, 7.6));


    }


}
