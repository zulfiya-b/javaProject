package Objects;

public class Car2 {
    public static void main (String [] args){
    Car car1 = new Car();
    car1.model = "Toyota";
    car1.color = "Blue";
    car1.year = 2022;

    Car car2 = new Car();
    car2.model = "Mercedes";
    car2.color = "Black";
    car2.year = 2023;

    car1.drive();
    car2.drive();

    car1.stop();
    car2.stop();

    car1.playMusic();
    car2.playMusic();

    }
}
