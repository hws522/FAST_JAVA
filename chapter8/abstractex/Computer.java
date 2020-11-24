package chapter8.abstractex;

public abstract class Computer {
    // 추상클래스는 단독으로 쓰려고 만드는 것이 아닌 상위클래스 용으로 사용.
    // 추상클래스의 시작. abstract. 하위클래스에서 구현됨.
    public abstract void display();

    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을  끕니다.");
    }
}
