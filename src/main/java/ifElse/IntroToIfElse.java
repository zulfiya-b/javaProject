package ifElse;

public class IntroToIfElse {

    public static void main (String [] args){

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");

        if(a > b) {
            System.out.println("a is more than b");

        } else {

            System.out.println("a is less than b");
        }

        int number1 = 100;
        int number2 = 50;

        if(number1 / number2 == 2) {
            System.out.println("YES, two!");}
        else {
            System.out.println("Not two!");}

        String elon = "Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not own Paypal");}

        /* create 5 if else statements,
        2 boolean statement with numbers
        3 boolean statements with strings
         */

        String rainbow = "red orange yellow green blue indigo purple";
        if (rainbow.contains("red")){
            System.out.println("Rainbow has red");
         } else {
            System.out.println("Rainbow doesn't have red ");
        }














    }



}
