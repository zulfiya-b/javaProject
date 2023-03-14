public class HomeworkIfElse {
    public static void main (String [] args){

        int num1 = 5;
        int num2 = 7;
        int num3 = 5;

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Two of the numbers are equal");
        } else {
            System.out.println("None of the numbers are equal");
        }

        int num = 9;

        if ((num % 3 == 0) || (num % 5 == 0)) {
            System.out.println("Multiple of 3 or 5");
        } else if ((num % 3 != 0) || (num % 5 != 0)) {
            System.out.println("Not a multiple of 3 or 5");
        }

        int num4 = 4;
        int num5 = 3;

        if ((num4 + num5) % 2 == 0){
            System.out.println("Even");
        } else if ((num4 + num5) % 2 != 0) {
            System.out.println("Odd");
        }

        int num6 = 7;

        if ((num6 % 1 == 0) && (num6 % 7 == 0)) {
            System.out.println("Prime");
        } else if ((num6 % 1 != 0) && (num6 % 7 != 0)) {
            System.out.println("Not prime");
        }






    }




}
