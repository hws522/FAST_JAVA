package chapter8.template;

public abstract class Car {

    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {
        // 구현 확장이 가능한 메서드. 하위클래스에서 오버라이딩을 통해 구현.
    }

    final public void run() {
        // 재정의 하면 안되는, 틀이 되는 메서드는 final을 사용함.
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
