package chapter8.templetex;

public class MenualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전을 합니다.");
        System.out.println("사람이 핸들을 조절합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

}
