package Objects;

public class Password {

    /*
    Constraints:
username's length <= 16
username must not have empty space
password must be from 8 to 16 length
password must contain at least one uppercase, one lowercase, one digit, one special char
email must contain @ and . and length < 32
age > 0
void setUsername(String username)
void setPassword(String password)
void setAge(int age)
void setEmail(String email)
     */

    public void setPassword(String password){
        boolean isValidPassword = true;
        if(16 >= password.length() && password.length() >= 8){
            String upperCaseRegex = "[A-Z]";
            String lowerCaseRegex = "[a-z]";
            String digitRegex = "\\d";
            String specialCharRegex = "[!@#%&*.~|=+-><:;{}]";

            if (!password.matches(upperCaseRegex) || !password.matches(lowerCaseRegex) ||
                    !password.matches(digitRegex) || !password.matches(specialCharRegex)){

                isValidPassword = false;

            }else{
                System.out.println("ERROR: password must contain at least one uppercase, one lowercase, one digit" +
                        "and one special character");
            }

        }else{
            System.out.println("ERROR: password's length must be at least 8 and at max 16 characters");
        }


        if(isValidPassword){
            System.out.println("SUCCESS: The password is valid!");
            this.password = password;
        } else {
            System.out.println("It is not valid.");
        }
    }



















}
