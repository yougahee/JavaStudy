package staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentlee = new Student("Lee");

        Student studentkim = new Student("Kim");

        System.out.println(studentlee.getSerialNum());
        System.out.println(studentkim.getSerialNum());

    }
}
