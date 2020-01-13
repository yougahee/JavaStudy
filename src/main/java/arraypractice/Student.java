package arraypractice;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    ArrayList<Book> arrayList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        arrayList = new ArrayList<Book>();
    }

    public void readBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        arrayList.add(book);
    }

    public void showInfo() {
        System.out.print(studentName + "학생이 읽은 책은 : ");
        for(Book book : arrayList){
            System.out.print(book.getTitle() + " ");
        }
        System.out.println("입니다");

    }


}
