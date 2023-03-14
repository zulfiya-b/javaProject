package ifElse;

public class IfElseDay2 {

    public static void main (String [] args) {

        // 1 to 7
        int day = 3;
        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else if (day == 7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day");
        }

        String dayOfWeek = "Tuesday";
        if (dayOfWeek.equalsIgnoreCase("Monday")){
            System.out.println(1);
        }
        else if (dayOfWeek.equalsIgnoreCase(("Tuesday"))){
            System.out.println(2);
        }
        else if (dayOfWeek.equalsIgnoreCase(("Wednesday"))){
            System.out.println(3);
        }
        else if (dayOfWeek.equalsIgnoreCase("Thursday")){
            System.out.println(4);
        } else if (dayOfWeek.equalsIgnoreCase("Friday")) {
            System.out.println(5);
        } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
            System.out.println(6);
        } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
            System.out.println(7);
        }
        else {
            System.out.println("Invalid number");
        }




        /*
        if time is between 9 and 17 - print WORK HOURS
        if time is between 7 and 9 and between 18 and 19- prinT COMMUTE HOURS
        if time is between 12 and 13 - print lunch time
        if time is between 20 and 22 - print DINNER TIME
        if time is between 22 and 24 - LATE HOURS
         */

        byte time = 25;

        /*
        if time is between 9 and 17 - print WORK HOURS
        if time is between 7 and 9 and between 18 and 19 - print COMMUTE HOURS
        if time is between 6 and 8 - print BREAKFAST TIME
        if time is between 12 and 13 - print LUNCH TIME
        if time is between 20 and 22 - print DINNER TIME
        if time is between 22 and 24 - LATE HOURS
        if time is between 0 and 6 - print SLEEP TIME
        else {
        print "INVALID TIME, enter time between 0 and 24"
         */

        if (time >= 9 && time <= 17) {
            if (time >= 12 && time <= 13) {
                System.out.println("Lunch time");
            }
            System.out.println("Work hours");
        }
        else if (time >= 7 && time <= 9 || time >= 18 && time <= 19) {

            System.out.println("Commute hours");
        }
        else if (time >= 6 && time <= 8) {
            System.out.println("Breakfast time");
        }

        else if (time >= 20 && time <= 22) {
            System.out.println("Dinner time");
            if (time == 22) {
                System.out.println("Late hours");
            }
        }
        else if (time >= 22 && time <= 24) {
            System.out.println("Late hours");
        }
        else if (time >= 0 && time <= 6) {
            System.out.println("Sleep time");
        }
        else {
            System.out.println("Invalid time");
        }






    }
}









        /*
        if (boolean){
        write some code
        }
        else if (boolean) {
        write else if code
        }
        else {
        write some code
        }
         */






