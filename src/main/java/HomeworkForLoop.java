public class HomeworkForLoop {
    public static void main(String[] args) {

        for (int a = 1; a <= 50; a++) {
            if (a % 5 == 0)
            {
                System.out.println(a);
            }


        }

        for (int a = 1; a <= 50; a++) {
            if (a % 5 == 0)
            {
                System.out.println(a);
            }
        }
        for ( int c = 10; c >= 1; c--){
            System.out.println(c);
        }


        for (int d = 1; d <= 5; d++){
            for (int e = 1; e <= 5; e++){
                System.out.print((d * e) + "\t");
            }
            System.out.println();

        }

        // Task 5

        for (int f = 1; f <= 20; f++){
            if (f % 2 != 0) {
                System.out.println(f);
            }
        }

        // Task 6

        int sum = 0;
        for (int g = 1; g <= 50; g++){
            if (g % 2 == 0){
                sum = sum + g;
            }
        }
        System.out.println(sum);

        // Task 7

        int sum1 = 0;
        int x = 5;

        int i =String.valueOf(x).length();

        for (int f = 1; f <= i; f++){

            sum1= sum1 + x % 10;
            x = x / 10;
        }
        System.out.println(sum1);

        // Task 8

        for (int row = 5; row >= 1; row-- ) {
            for (int numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 9

        for (int g = 1; g <= 4; g++) {
            for (int h = 1; h <= g; h++){
                System.out.print(g);
            }
            System.out.println("");
        }























    }


}



