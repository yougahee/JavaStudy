package chapter15;

//class MyThread extends Thread {
//    public void run() {
//        int i;
//
//        for(i=0; i<=200; i++) {
//            System.out.print(i + "\t");
//
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class MyThread implements Runnable {
    public void run() {
        int i;

        for(i=0; i<=200; i++) {
            System.out.print(i + "\t");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//여기는 총 3개의 쓰레드 존재 --> start, end 를 찍는 main thread, th1, th2
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("start");
        /*MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();*/

        /*MyThread runner1 = new MyThread();
        Thread th1 = new Thread(runner1);
        th1.start();

        MyThread runner2 = new MyThread();
        Thread th2 = new Thread(runner2);
        th2.start();*/

        Thread t = Thread.currentThread();
        System.out.println(t.toString()); // Thread[main,5,main] --> defalt priority 5, 돌아가는 thread 이름

        System.out.println("end");
    }
}
