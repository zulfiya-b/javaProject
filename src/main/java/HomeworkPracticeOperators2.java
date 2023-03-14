public class HomeworkPracticeOperators2 {

    public static void main (String [] args) {

        int a = 100;
        int b = 200;
        int ab = a+b;
        System.out.println(ab);

        int q = 5;
        int w = 9;
        int e = 10;
        int qwe = q + w + e;
        System.out.println(qwe);

        int t = 1;
        int v = 2;
        int c = 3;
        int d = 4;
        int m = 7;
        int f = 8;
        int g = 10;

        System.out.println(t + "+" + v + "=" + (t + v));
        System.out.println(c + "-" + t + "=" + (c-t));
        System.out.println(v + "*" + v + "=" + (v*v));
        System.out.println(d + "/" + v + "=" + (d/v));
        System.out.println(v + "+" + f + "=" + (v+f));
        System.out.println(g + "%" + m + "=" + (g%m));

        int length = 9;
        int width = 15;
        int area = length*width;
        System.out.println(area);

        int perimeter = 2*(length + width);
        System.out.println(perimeter);

        int a1 = 8;
        int b1 = 2345;
        int c1 = 3;
        int d1 = (a1+b1)/c1;
        System.out.println(d1);

        int e1 = (d1%5)*5;
        System.out.println(e1);

       int f1 = a1 += b1;
       System.out.println(f1);

       int f2 = f1 /= c1;
       System.out.println(f2);

       int g1 = d1 %= 5;
        System.out.println(g1);

        int g2 = g1 *= 5;
        System.out.println(g2);

        int number1 = 23;
        int number2 = 45;
        System.out.println(number1 == number2);

        int number3 = -10;
        int number4 = 10;
        System.out.println(number4 == number3);






















    }



}
