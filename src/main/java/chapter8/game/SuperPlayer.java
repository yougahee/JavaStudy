package chapter8.game;

public class SuperPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄~청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump 합니다!");
    }

    @Override
    public void turn() {
        System.out.println("Turn을 멋지게 합니다!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급 레벨 입니다.  ********");
    }
}
