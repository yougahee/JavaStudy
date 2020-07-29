package chapter11.collection.treeset;

import javax.swing.*;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("이순신");
        treeSet.add("유가희");

        for( String str : treeSet) {
            System.out.println(str);
        }
    }
}
