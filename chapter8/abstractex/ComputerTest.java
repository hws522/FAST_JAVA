package chapter8.abstractex;

public class ComputerTest {

    public static void main(String[] args) {
        // Computer computer = new Computer(); 추상클래스라서 new 안됨. 인스턴스화 불가.
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();
    }
}
