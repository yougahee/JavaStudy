/*
package chapter12.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        //모두 상수다! final 키워드가 숨겨져 있다고 생각하면 됨
        int num = 100;

        //runnable한 객체를 반환하라
        class MyRunnable implements Runnable {

            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);


    }
}
*/
