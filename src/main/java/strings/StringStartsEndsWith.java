package strings;

public class StringStartsEndsWith {
    public static void main (String [] args){
        String banner = "Thanksgiving Sale 20%";

        boolean isSale = banner.startsWith("Thanks");
        System.out.println(isSale);

        System.out.println(banner.startsWith("thanks"));

        System.out.println(banner.startsWith("T"));

        System.out.println(banner.startsWith("Giving"));

        boolean endsWith = banner.endsWith ("%");
        System.out.println(endsWith);

        System.out.println(banner.endsWith("Sale 20% "));

        System.out.println(banner.endsWith("sale 20%"));





    }


}
