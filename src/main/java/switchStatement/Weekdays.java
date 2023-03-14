package switchStatement;

import java.util.Scanner;

public class Weekdays {
    public static void main (String [] args){

    /*int day = 4;

    switch (day){

        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Weekdays");
            break;
        case 6:
        case 7:
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Invalid day");}

        char letter = 'A';
        switch (letter){
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                */



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade From A to F");
        char grade = sc.nextLine().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }

        Scanner season = new Scanner(System.in);
        System.out.println("Enter the month from 1 to 12");
        int month = season.nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }

        }

        }















    //using switch statement
    //if day = 1,2,3,4,5 - print weekday
    // if day = 6,7 = weekend else print invalid day




