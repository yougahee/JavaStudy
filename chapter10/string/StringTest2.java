package chapter10.string;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        java = java.concat(android);

        System.out.println(java);
    }
}
