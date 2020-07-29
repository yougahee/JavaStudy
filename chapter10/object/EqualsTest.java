package chapter10.object;

class Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student)obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

}

public class EqualsTest {
    public static void main(String[] args) {

        String str1 = new String();
        String str2 = new String();

        //논리, 물리적 위치까지 같아야함
        System.out.println(str1 == str2);
        //논리적 값만 같으면 true
        System.out.println(str1.equals(str2));

        Student studentLee = new Student(100,"이순신");
        Student studentSH = studentLee;
        Student studentKim = new Student(100,"김유신");

        System.out.println(studentLee == studentKim);
        System.out.println(studentLee.equals(studentKim));

        System.out.println(studentKim.hashCode());
        System.out.println(studentLee.hashCode());

    }


}
