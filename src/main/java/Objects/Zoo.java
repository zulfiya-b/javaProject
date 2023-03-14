package Objects;

public class Zoo {

    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;

    public void eat(){
        System.out.println(type + isCarnivore + isMammal + age + habitat + "eats food");
    }

    public void sleep(){
        System.out.println(type + isCarnivore + isMammal + age + habitat + "sleeps a lot");
    }

    public void play(){
        System.out.println(type + isCarnivore + isMammal + age + habitat + "plays with other animals");
    }



}

