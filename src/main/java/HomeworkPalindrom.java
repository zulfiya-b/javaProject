import java.util.Scanner;

public class HomeworkPalindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int length = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) == word.charAt(length-1-i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);









    }

}
