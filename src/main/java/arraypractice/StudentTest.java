package arraypractice;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1, "Lee");
        Student studentKim = new Student(1, "Kim");
        Student studentCho = new Student(1, "Cho");

        studentLee.readBook("태백산맥1");
        studentLee.readBook("태백산맥2");

        studentKim.readBook("토지1");
        studentKim.readBook("토지2");
        studentKim.readBook("토지3");

        studentCho.readBook("해리포터1");
        studentCho.readBook("해리포터2");
        studentCho.readBook("해리포터3");
        studentCho.readBook("해리포터4");
        studentCho.readBook("해리포터5");
        studentCho.readBook("해리포터6");

        studentLee.showInfo();
        studentKim.showInfo();
        studentCho.showInfo();


    }
}
