import java.util.Scanner;

public class HomeworkPracticeBreakContinue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scanner.nextInt();


        if (number <= 0){
            System.out.println("Input must be positive. Please try again");
        }
        else if (number >0) {
            for (int k = 1; k <= number; k++){
                if (k % 3 == 0 && k % 5 != 0){
                    System.out.println(k);
                    continue;
                }
                else if (k < 3 && number<3) {
                    System.out.println("There are no integers less than " + number + " that are divisible by 3 but not by 5.");
                    break;
                }

            }


        }





























    }


}
