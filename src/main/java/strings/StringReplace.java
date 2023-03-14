package strings;

public class StringReplace {
    public static void main (String [] args){

        String word = "Apple banana strawberry";
        word = word.replace('a', 'e');

        System.out.println(word);
        System.out.println(word.replace('e', 'a'));

        String countries = "Italia Columbia Croatia ";
        System.out.println(countries.replace(" ", " republic. " ));

        String foods = "hot lentil soup, hot plov, cold kompot, cold ice cream, warm pasta, warm pizza";

        //replace hot with tasty, print, store in foods
        // replace cold with cool, store in variable and print
        //replace warm with italian, store and print

        foods = foods.replace("hot", "tasty");
        System.out.println(foods);

        foods = foods.replace("cold", "cool");
        System.out.println(foods);

        foods = foods.replace("warm", "Italian");
        System.out.println(foods);

        String letters = "fbjqbw fas vfweg etj4rg vfefweterhe dgeryerts sgsg sgsdg";
        letters = letters.replace('f', 'a');
        System.out.println(letters);

        letters = letters.replace('f', 'a');
        letters = letters.replace('b', 'a');
        letters = letters.replace('j', 'a');
        letters = letters.replace('q', 'a');
        letters = letters.replace('w', 'a');
        letters = letters.replace('v', 'a');
        letters = letters.replace('s', 'a');
        letters = letters.replace('e', 'a');
        letters = letters.replace('g', 'a');
        letters = letters.replace('t', 'a');
        letters = letters.replace('4', 'a');
        letters = letters.replace('r', 'a');
        letters = letters.replace('h', 'a');
        letters = letters.replace('d', 'a');
        letters = letters.replace('y', 'a');

        System.out.println(letters);


    }




}
