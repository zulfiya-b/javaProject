import java.util.Scanner;

public class HomeworkReverseString {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("raspberry");
        String str2 = scanner1.next();
        String reversedWord = "";
        for (int k = str2.length()-1; k >= 0; k--){
            reversedWord = reversedWord + str2.charAt(k);
        }
        System.out.println(reversedWord);



















    }

}
