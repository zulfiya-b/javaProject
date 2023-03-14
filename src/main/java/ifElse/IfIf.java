package ifElse;

public class IfIf {
    public static void main (String [] args){

        String weather = "warm and rainy";

        if (weather.equals("cold")){
            System.out.println("cold, stay home!");
        }
        else if (weather.contains("hot")) {
            System.out.println("hot, stay home!");

        }
        else if (weather.contains("rainy")){
            System.out.println("rainy, stay home!");

        }
        else {
            System.out.println("party hard!");
        }



    }


}
