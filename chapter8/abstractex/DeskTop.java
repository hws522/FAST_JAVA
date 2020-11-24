package chapter8.abstractex;

public class DeskTop extends Computer {

    public void display() {
        System.out.println("DeskTop display");
    }

    public void typing() {
        System.out.print("DeskTop typing");
    }

    public void turnOff() {
        System.out.println("DeskTop turnoff");
    } // 오버라이딩.

}
