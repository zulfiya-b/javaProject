package strings;

public class PracticeStrings {

    public static void main (String [] args) {

       /*
        String singerName = "Michael Jackson";
        System.out.println(singerName.length()); //returns number of chars

        System.out.println(singerName.endsWith("on")); //true
        System.out.println(singerName.startsWith("Misha")); //false

        System.out.println(!singerName.isEmpty()); //true
        System.out.println(singerName.toLowerCase()); //michael jackson
        System.out.println(singerName); //Michael Jackson

        singerName = singerName.toUpperCase();
        System.out.println(singerName);

        System.out.println(singerName.charAt(0)); //M

        System.out.println("" + singerName.charAt(0) + singerName.charAt(3)); //MH
        System.out.println(singerName.charAt(8));

        System.out.println(singerName.indexOf("c")); //2
        System.out.println(singerName.indexOf("c", 3));
        System.out.println(singerName.indexOf("W")); //-1

        System.out.println(singerName.charAt(2352)); //Index out of bound error

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName2); // true
        singerName = singerName2;
        System.out.println(singerName.equals(singerName2)); //true
        System.out.println(singerName == singerName2);//true

        */

        String message = "Hello everyone. Let's do Java String exercises";

        System.out.println("The character at position 10 is " +  message.charAt(10));

        System.out.println(message.length());

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(5));

        boolean lastLetter = message.endsWith ("s");
        System.out.println(lastLetter);

        System.out.println(message.toLowerCase().charAt(0));
        System.out.println(message.toUpperCase().charAt(45));















    }




}
