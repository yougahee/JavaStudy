package chapter8.Car;

public class Genesis extends Car{
    @Override
    public void drive() {
        System.out.println("Genesis차량이 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("Genesis차량이 정지합니다.");
    }
}
