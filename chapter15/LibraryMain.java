package chapter15;

import java.util.ArrayList;

class Library{
    public ArrayList<String> books = new ArrayList<>();

    public Library() {
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");
        books.add("태백산맥 4");
        books.add("태백산맥 5");
        books.add("태백산맥 6");
        books.add("태백산맥 7");
    }

    public String lendBook() {
        Thread t = Thread.currentThread();

        String title = books.remove(0);
        System.out.println(t.getName() + ":" + title + " lend");
        return title;
    }

    public void returnBook(String title) {
        Thread t = Thread.currentThread();
        books.add(title);

        System.out.println(t.getName() + ":" + title + " lend");
    }
}

class Student extends Thread{
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            sleep(5000);
            LibraryMain.library.returnBook(title);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static Library library = new Library();

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.start();
        std2.start();
        std3.start();
    }
}
