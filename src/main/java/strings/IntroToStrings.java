package strings;

public class IntroToStrings {

    public static void main(String [] args){

        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName);
        System.out.println(lastName);

        firstName = "Mike";
        lastName = "Golt";

        System.out.println(lastName); //Golt

        String myName = "Zulfiya";
        String familyName = "Burkhanova";
        String middleName = "Jahongirovna";
        byte age = 32;
        String address = "32 Warrensville Center Road";
        String mobilePhone = "5133072859";
        String friendName = "Vika";
        String city = "Cleveland";

        System.out.println(myName);
        System.out.println(familyName);
        System.out.println(middleName);
        System.out.println(age);
        System.out.println(address);
        System.out.println(mobilePhone);
        System.out.println(friendName);
        System.out.println(city);

        System.out.println("I am" + " " + age + " " + "years old");

        String homeAddress = "32 Warrensville Center Road, Cleveland";
        System.out.println("My address is:" + " " + homeAddress);

        /*String concatenation is you take 2 strings and put together into one*/

        String town = "London";
        System.out.println(town);

        String town2 = new String("New York");
        System.out.println(town2);

        System.out.println(town.length()); //length is number of characters in town
        System.out.println(town2.length()); //8

        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is: " + name.length());

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        Boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame);

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println(fruit1.equals(fruit2));

        boolean isSame2 = !fruit1.equals(fruit2); // not equals, TRUE

        int cucumber = 5;
        int tomato = 10;

        System.out.println("cucumber: " + cucumber);
        System.out.println("tomato: " + tomato);

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILLINOIS";
        String state5 = "florida";

        boolean vv = (!state1.equals(state2));
        System.out.println(vv);

        boolean bbr = (state2.equalsIgnoreCase(state4));
        System.out.println(bbr);

        boolean bbb = (state3.equals(state5));
        System.out.println(bbb);

        boolean uuu = (state5.equals(state1));
        System.out.println(uuu);

        boolean ppp = (!state4.equals(state3));
        System.out.println(ppp);
























    }


}
