package chapter11.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

        linkedList.add(1, "D");

        System.out.println(linkedList);
    }
}
