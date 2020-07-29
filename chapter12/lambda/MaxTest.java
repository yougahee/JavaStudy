package chapter12.lambda;

public class MaxTest {
    public static void main(String[] args) {
        MyMaxNum max = (x, y) -> (x >= y)? x: y;
        System.out.println(max.getMaxNum(10,25));
    }
}
