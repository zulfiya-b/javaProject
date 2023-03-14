package Objects;

public class Zoo2 {
    public static void main (String [] args){
        Zoo Tiger = new Zoo();
        Tiger.type = "forrest animal";
        Tiger.isMammal = true;
        Tiger.isCarnivore = true;
        Tiger.age = 10;
        Tiger.habitat = "forrest";

        Zoo Whale = new Zoo();
        Whale.type = "sea animal";
        Whale.isMammal = true;
        Whale.isCarnivore = false;
        Whale.age = 15;
        Whale.habitat = "ocean";

        Tiger.eat();
        Whale.eat();

        Tiger.sleep();
        Whale.sleep();

        Tiger.play();
        Whale.play();




    }

}
