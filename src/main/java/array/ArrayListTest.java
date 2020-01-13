package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("aaAa");
        array.add("bbb");
        array.add("ccc");

        for(int i=0; i< array.size(); i++) {
            String string = array.get(i);
            System.out.println(string);
        }

        for(String string : array) {
            System.out.println(string);
        }
    }
}
