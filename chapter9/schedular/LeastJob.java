package chapter9.schedular;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {

        System.out.println("상담 전화를 순서대로 대기열에 넣겠습니다.");
    }

    @Override
    public void sendCallAgent() {

        System.out.println("상담업무가 없거나 대기가 가장 짧은 상담원에게 넘기겠습니다.");
    }
}
