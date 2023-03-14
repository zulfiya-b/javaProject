package primitiveDataTypes;

public class PracticeDoubleFloat {

    public static void main (String [] args) {



        /* float and double are variables that store decimal numbers
        double is larger than float
        double is the most precise variable
        Java thinks that all decimal numbers are doubles
        to make sure float is float put F/f in the end
        both double and float can store whole numbers

         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.99555444444444444444444555555555;
        System.out.println(priceOfApples);

        priceOfBread = 98.1;



        /* create 10 doubles, create 10 floats, assign values, reassign values, do casting */

        int a = 5;
        double d = 8.5;
        a = (int)d;
        System.out.println(a); //8


        short sh;
        float f = 12.7F;
        f = 12.7F;

        sh = (short) f;
        System.out.println(sh); //12

        double price = 2.5;
















    }
}
