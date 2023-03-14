package ifElse;

public class ContainsE {
    public static void main (String [] args){
        /* Create a program that asks the user to enter a word and then checks whether the word contains the letter 'e' or not.
        If the word contains 'e', the program should print out the index of the first occurrence of 'e' in the word.
        If the word does not contain 'e', the program should print out "The word does not contain the letter 'e'.
         */

        String word = "Evergreen";

        if (word.contains("e")) {
            System.out.println(word.indexOf('e'));
        } else {
            System.out.println("the word doesn't contain e");
        }






    }



}
