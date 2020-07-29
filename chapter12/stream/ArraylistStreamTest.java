package chapter12.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArraylistStreamTest {
    public static void main(String[] args) {
        ArrayList<String> sArr = new ArrayList<>();

        sArr.add("Gahui");
        sArr.add("Josh");
        sArr.add("Gabie");

        Stream<String> streamArr = sArr.stream();

        streamArr.forEach(s -> System.out.print(s + " "));
        System.out.println();

        sArr.stream().sorted().forEach(s-> System.out.print(s + " "));
        System.out.println();
        sArr.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

    }
}
