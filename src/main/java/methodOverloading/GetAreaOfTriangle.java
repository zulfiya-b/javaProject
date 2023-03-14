package methodOverloading;

public class GetAreaOfTriangle {



        /* create 2 getAreaOfTriangle methods
    1. int base, int height (1/2 * base * height)

    2. int side1, int side2, int side3

    int s = (a + b + c) / 2
    int area = sqrt(s (s-a)(s-b)(s-c))
    Math.sqrt()

     */
        public double getAreaOfTriangle(int base, int height){

        int area = 1/2 * base * height;
        return area;
        }

        public double getAreaOfTriangle(int a, int b, int c){
            int semiPerimeter = (a + b + c) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            return area;
        }

        public double getAreaOfTriangle(double base, double height){
        double area = 1/2 * base * height;
        return area;
    }

        public double getAreaOfTriangle(double a, double b, double c){
        double semiPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        return area;
    }

        }


















