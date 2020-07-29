package chapter9.schedular;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객의 우선순위가 높으면 가져오자!");
    }

    @Override
    public void sendCallAgent() {
        System.out.println("업무숙련도가 높은 상담원에게 먼저 배정합니다.");

    }
}
