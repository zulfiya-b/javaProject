package ifElse;

public class AndOperator {
    public static void main (String [] args){

        if (2 < 3 && 5 < 10) {
            System.out.println("bye bye");
        }

        if (false && true){
            System.out.println("potato");

        }
        if (true && true){
            System.out.println("finally true");
        }

        String actualusername = "sunshine 123";
        String actualpassword = "moonlight456!true";
        String actualemail = "sunshine123@gmail.com";

        String enteredusername = "sunshine 123";
        String enteredpassword = "moonlight456!true";
        String enteredemail = "sunshine123@gmail.com";

        /* if username and password are correct => logged in
           if username correct, password incorrect =>
             */

        if (enteredusername.equals(actualusername) && enteredpassword.equals(actualpassword)){
            System.out.println("Logged in");
        } if (enteredusername.equals(actualusername) &&   !enteredpassword.equals(actualpassword)){
            System.out.println("Incorrect password, try again");
        } if (!enteredusername.equals(actualusername));{
            System.out.println("Username does not exist");
        } if (!enteredusername.equals(actualusername) && enteredemail.equals(actualemail) &&
                enteredpassword.equals(actualpassword));{
            System.out.println("Recover username");
        } if (enteredusername.equals(actualusername) && enteredemail.equals(actualemail) &&
                !enteredpassword.equals(actualpassword)); {
        System.out.println("Recover password");
        } if (enteredusername.equals(actualusername) && !enteredemail.equals(actualemail) &&
                enteredpassword.equals(actualusername)); {
            System.out.println("Recover email");
        }



        }




    }



