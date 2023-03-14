package arithmeticOperators;

public class CompoundOperators {
    public static void main(String[] args) {
        int a = 5;
        a++; //a = a + 1
        a++; //
        a++;

        System.out.println(a); //8

        a--; //a = a - 1;
        a--;
        System.out.println(a); //6


        int age = 18;

        System.out.println(age++); //post increment 18
        System.out.println(age); //19


        int price = 20;
        System.out.println(++price); //pre increment 21
        System.out.println(price++); //21
        System.out.println(price); //22


        int money = 20;

        money += 3; // money = money + 3

        System.out.println(money); //23

        money += 5;
        System.out.println(money); //28

        money -= 8;
        System.out.println(money); //20

        money *= 2; // money = money * 2
        System.out.println(money); //40

        money /= 4;
        System.out.println(money); //10

        money %= 2;
        System.out.println(money); //0

        //System.out.println(342 % 5); //342 cannot be divided by 5

        int x = 4;
        x *= 1;
        System.out.println(x + "*" + '1' + '=' + (x *= 1));

        x *= 2;
        System.out.println(x + "*" + '2' + '=' + (x *= 2));


    }
}