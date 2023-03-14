public class HomeworkPracticeStringManipulation {

    public static void main (String [] args){
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

        String word = "Hello world";
        System.out.println(word.indexOf("world"));

        System.out.println(word.charAt(0));

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        System.out.println(word.toLowerCase() == word.toUpperCase());

        String word1 = "the quick brown fox";

        System.out.println((word1.substring(0,1) + word1.substring(4,5) + word1.substring(10,11) +
                word1.substring(16,17)).toUpperCase());

        String word2 = "Hello";
        System.out.println(Character.toString(word2.charAt(4))+Character.toString(word2.charAt(3))+Character.toString(word2.charAt(2))+Character.toString(word2.charAt(1))
        +Character.toString(word2.charAt(0)));

        String word3 = "Hello World";
        System.out.println(word3.toLowerCase());
        System.out.println((Character.toString(word3.charAt(1))+Character.toString(word3.charAt(4))+Character.toString(word3.charAt(7))).length());

        String word4 = "Hello";
        String word5 = "World";
        System.out.println(word4.concat(word5));

        String word6 = "hello";
        String word7 = "HELLO";
        System.out.println(word6.equalsIgnoreCase(word7));

        String word8 = "Hello World";
        System.out.println(word8.length());

        String word9 = "Hello";
        System.out.println(word9.charAt(3));

        String word10 = "Hello World";
        System.out.println(word10.indexOf("l"));

        String word11 = "hello";
        String word12 = "hello";
        System.out.println(word11 == word12);
        System.out.println(word11.equals(word12));

        String wordA = "hello";
        String wordB = "HELLO";
        System.out.println(wordA == wordB);
        System.out.println(wordA.equals(wordB));

        String wordC = "HELLO WORLD";
        System.out.println(wordC.toLowerCase());

        String wordD = "hello world";
        System.out.println(wordD.toUpperCase());

        String wordE = "Hello World";
        wordE = wordE.replace("l", "r");
        System.out.println(wordE);

        String wordF = "the quick brown fox";

        System.out.println((wordF.substring(0,1) + wordF.substring(4,5) + wordF.substring(10,11) +
                wordF.substring(16,17)).toUpperCase());










    }
}
