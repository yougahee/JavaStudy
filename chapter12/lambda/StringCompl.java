package chapter12.lambda;

public class StringCompl implements StringConcat{

    @Override
    public void stringMadeConcat(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
}
