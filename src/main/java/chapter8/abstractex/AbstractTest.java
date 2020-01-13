package chapter8.abstractex;

public class AbstractTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        Computer myNoteBook = new MyNoteBook();

        myNoteBook.display();
        myNoteBook.turnOn();



    }
}
