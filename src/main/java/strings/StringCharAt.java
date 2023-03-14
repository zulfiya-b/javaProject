package strings;

public class StringCharAt {
    public static void main (String [] args){
        String welcomesign = "Hello everyone! Welcome to Chicago";
        char c = welcomesign.charAt(14);
        System.out.println(c);

        char cc = welcomesign.charAt(2);
        System.out.println(cc);

        // print the last letter using charAt and length methods

        int length = welcomesign.length();
        System.out.println(length);
        System.out.println(welcomesign.charAt(welcomesign.length()-1));

        // city.charAt(4) => 'a'
        // city.indexOf('a') => 4







    }



}
