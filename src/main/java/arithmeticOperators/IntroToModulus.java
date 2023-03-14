package arithmeticOperators;

public class IntroToModulus {

    public static void main (String [] args){

        /*
        % - modulus returns you the remainder after division */

        int a = 12;
        int b = 5;
        int c = a % b;
        System.out.println(c);

        System.out.println(100 % 30);
        System.out.println(25 % 5);
        System.out.println(90 % 40);
        System.out.println(90 % 20);
        System.out.println(5 % 4);

        int usersAge = 43;


        System.out.println(usersAge % 2 == 0);

        boolean isOdd = usersAge % 2 != 0;

        System.out.println(30 % 7 != 0);







    }


}
