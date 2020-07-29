package chapter11.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2)* (-1);
    }
}
public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("이순신");
        treeSet.add("유가희");

        for(String str : treeSet) {
            System.out.println(str);
        }
    }
}
