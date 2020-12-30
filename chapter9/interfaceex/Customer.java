package chapter9.interfaceex;

public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void order() {
        System.out.println("customer order"); // 재정의
    }

    public void sayHello() {
        System.out.println("Hello");
    }

}
