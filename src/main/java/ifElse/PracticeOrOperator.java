package ifElse;

public class PracticeOrOperator {

    public static void main (String [] args){

        String menu = "pizza lagman tea bread cake coffee water";

        // if menu has pizza and soda - print order pizza and soda
        // if menu has tea and cake - print order dessert
        // if menu has lagman and tea - print order lagman and tea, asian is here!
        // if menu has coffee || smoothie - print breakfast time
        // if menu has pizza and pasta - print Italian day
        // if menu has tea and coffee and water and soda - print order only drinks
        // if menu has

        if (menu.contains("pizza") && menu.contains("soda")){
            System.out.println("order pizza and soda");
        }
        if (menu.contains("tea") && menu.contains("cake")){
            System.out.println("order dessert");
        }
        if (menu.contains("lagman") && menu.contains("tea")){
            System.out.println("order lagman and tea, asian is here!");
        }
        if (menu.contains("coffee") || menu.contains("smoothie")){
            System.out.println("breakfast time");
        }
        if (menu.contains("pizza") && menu.contains("pasta")){
            System.out.println("Italian day");
        }
        if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water") && menu.contains("soda") ){
            System.out.println("order only drinks");
        }
        if (menu.contains("lagman") && !menu.contains("plov")){
            System.out.println("not uzbek restaurant");
        }






    }


}
