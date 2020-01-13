package chapter8.Car;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public Car() {

    }

    public void startCar() {
        System.out.println("차의 시동을 킵니다.");
    }

    public void turnOffCar() {
        System.out.println("차의 시동을 끕니다.");
    }

    //템플릿 메서드(재정의 불가능 --> final)
    final public void run() {
        startCar();
        drive();
        stop();
        turnOffCar();
    }
}
