package Objects;

public class School {
    public static void main (String[] args) {
        Student student1 = new Student();
        student1.name  = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Potato";
        student2.phone = "235262672";
        student2.email = "potato@gmail.com";
        student2.age = 17;
        student2.major = "Accounting";

        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();


    }



}
