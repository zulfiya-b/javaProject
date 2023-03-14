public class HomeworkStringManipulation2 {
    public static void main (String [] args){

        String holiday = "The easter holiday is coming soon";
        boolean date = holiday.endsWith("soon");
        System.out.println(date);

        String word2 = holiday.substring(4,10);
        System.out.println(word2);

        System.out.println(holiday.replace('e', 'i'));

        String word3 = holiday.substring(11, 18);
        System.out.println(word3);

        System.out.println(holiday.indexOf("n"));

        System.out.println(holiday.startsWith("The"));

        System.out.println(holiday.replace("o", "u"));

        System.out.println(holiday.indexOf("o"));

        System.out.println(holiday.trim());

        System.out.println(holiday.toUpperCase());


    }


}
