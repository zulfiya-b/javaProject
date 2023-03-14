public class IfElseHomework {
    public static void main (String [] args){
        int number = 40;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0){
            System.out.println("Zero");
        }

        int year = 2019;

        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

        int num1 = 3;
        int num2 = 123;

        if (num1 > num2) {
            System.out.println("Num1 is larger than num2");
        } else if (num2 > num1) {
            System.out.println("Num2 is larger than num1");
        } else {
            System.out.println("Num 1 is equal to num2");
        }

        double tempInFahrenheit = 77.3;

        if (tempInFahrenheit <= 32) {
            System.out.println("below freezing");
        } else if (tempInFahrenheit >= 212) {
            System.out.println("above boiling");
        } else {
            System.out.println("normal");
        }

        byte month = 6;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }



    }



}
