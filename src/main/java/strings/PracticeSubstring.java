package strings;

public class PracticeSubstring {

    public static void main (String [] args) {

        String first_name = "Jacob";
        String last_name = "Coffee";

        // creat string name1 = Jee;
        // string name2 = Cee;
        // string name3 = Jacee;
        // string name4 = Cob
        // string name5 = Feeco
        // string name6 = Ofja

       //  charAt, substring, replace, uppercase, lowercase, indexof

        System.out.println(last_name.replace("Coff", "J"));
        System.out.println(last_name.replace("Coff", "C"));
        System.out.println(last_name.substring(0,1) + last_name.substring(4,6));
        System.out.println(first_name.substring(0,3) + last_name.substring(4,6));
        System.out.println(last_name.charAt(0) + "" + last_name.charAt(1) + first_name.charAt(4));
        System.out.println(last_name.toUpperCase().charAt(2) + last_name.substring(4) + first_name.substring(2,4));
        System.out.println(last_name.toUpperCase().charAt(1) + last_name.charAt(2) + first_name.toLowerCase().charAt(1) +
                first_name.charAt(1));

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1: " + str1);
        System.out.println("str2: " );






    }


}
