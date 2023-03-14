import java.util.Scanner;

public class HomeworkSwitch {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a symbol");
        String symbol = scanner.next();

        switch (symbol) {
            case "!":
                System.out.println("exclamation mark");
                break;
            case "?":
                System.out.println("question mark");
            case "%":
                System.out.println("modulus");
                break;
            case "#":
                System.out.println("hash");
                break;
            case "*":
                System.out.println("star");
                break;
            case "@":
                System.out.println("at");
                break;
            case "$":
                System.out.println("dollar sign");
                break;
            default:
                System.out.println("Invalid");


        }

    }







    }
