package chapter9.schedular;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에 넣겠습니다.");
    }

    @Override
    public void sendCallAgent() {
        System.out.println("다음순서의 상담원에게 넘겨줍니다.");

    }
}
