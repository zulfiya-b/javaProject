public class HomeworkStringManipulation {

    public static void main (String [] args){

    String str1 = "Hello, Universe!";
    char ch = 'o';
        System.out.println(str1.contains("o"));

    String str2 = "Hello, World!";
    int start = 7;
    int end = 12;

    String world = str2.substring(7,12);
        System.out.println(world);

    String str3 = "Good morning World";
        System.out.println(str3.charAt(13));

     String str4 = "   I love coding   ";
        System.out.println(str4.trim());

    String str5 = "Learn as if you will live forever, live like you will die tomorrow.";
        System.out.println(str5.replace("o",""));


    }



}
