package chapter7.inheritance;

public class VIPCustomer extends Customer { // 기본 customer 기능들이 중복되므로 상속 받음.

    private int agentID;// 담당 상담원
    double salesRatio; // VIP 할인율

    // public VIPCustomer() {
    // customerGrade = "VIP"; // 상속을 받더라도 private 은 access 할 수 없음.
    // bonusRatio = 0.05;
    // salesRatio = 0.1;
    // }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int calcPrice(int price) // 오버라이딩.
    {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
