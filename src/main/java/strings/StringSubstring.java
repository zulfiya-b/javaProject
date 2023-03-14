package strings;

import java.util.Locale;

public class StringSubstring {

    public static void main(String [] args){

        String message = "Hello Chicago, why are you cold and windy?";

        String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people, " +
                "the average salary is 90k dollars, and our president is Joe Biden";

        // country = USA
        // population = 140 million
        // salary = 90k dollars
        // president = Joe Biden

        String country = welcomeSign.substring(11, 14);
        System.out.println("country = " + country);

        String populaltion = welcomeSign.substring(33,46);
        System.out.println("population = " + populaltion);

        String salary = welcomeSign.substring(welcomeSign.indexOf("9"), welcomeSign.indexOf(", and"));
        System.out.println(salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);

        String phrase = "Just one positive thought in the morning can change your whole day.";

        // using substring method, print - Just a thought
        // positive morning
        // whole morning
        // change one day
        // change your thought

        System.out.println(phrase.substring(0,4) + " a " + phrase.substring(18,25));
        System.out.println(phrase.substring(9,17) + phrase.substring(32,40));
        System.out.println(phrase.substring(57,62) + phrase.substring(32,40));
        System.out.println(phrase.substring(45,52) + phrase.substring(5,9) + phrase.substring(63,66));
        System.out.println(phrase.substring(45,52) + phrase.substring(46,50) + phrase.substring(18,25));

        String thought = phrase.substring(18,25);
        System.out.println(phrase.substring(0,4) + "a" + phrase.substring(18,25));
        System.out.println(phrase.substring(9,17));

        int beginIndex = phrase.indexOf('p');
        int endIndex = phrase.indexOf("thought");

        System.out.println(phrase.substring(beginIndex, endIndex));

        //beginIndex = phrase.indexOf("mor");
        //endIndex = phrase.indexOf("can");

        String str1 = "hi";
        String str2 = "bye";

        // print : hibyebyehi

        System.out.println(str1 + str2 + str2 + str1);

        //print: hi bye HI HI BYE BYE bye hi

        System.out.println(str1 +" " +  str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " "  +
                str2.toUpperCase() + " " + str2.toUpperCase() + " " +str2 + " " + str1);

        // print bi

        System.out.println(str2.substring(0,1) + str1.substring(1));
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str2.charAt(0) + "" + str1.charAt(1));

        String see = "see";
        String hear = "hear";

        //print sear. substring, replace , charAt and substring

        System.out.println(see.substring(0,2) + hear.substring(2,4));
        System.out.println(hear.replace('h', 's'));
        System.out.println(see.charAt(0) + hear.substring(1,4));
















    }



}
