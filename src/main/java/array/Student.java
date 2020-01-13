package array;

import java.util.ArrayList;

public class Student {
    private int studentID;
    String studentName;
    ArrayList<Subject> subjectArrayList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        subjectArrayList.add(subject);
    }

    public void showInfo() {
        int total =0;
        for(Subject subject : subjectArrayList) {
            total += subject.getScore();
            System.out.println("학생" + studentName + "님의 " + subject.getName() + "과목의 성적은 " + subject.getScore() + "점 입니다.");
        }
        System.out.println("학생" + studentName + "님의 총점은 " + total + "점 입니다." );
    }

}
