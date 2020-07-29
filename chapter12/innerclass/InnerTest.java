package chapter12.innerclass;

class OutClass {
    private int num =10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    public class InClass {
        int iNum = 100;
        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }
    public void usingInner() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();

    }

}
