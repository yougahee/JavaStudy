package chapter8.Car;

public class Sonata extends Car {
    @Override
    public void drive() {
        System.out.println("Sonata 차량이 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("Sonata 차량이 정지합니다.");
    }
}
