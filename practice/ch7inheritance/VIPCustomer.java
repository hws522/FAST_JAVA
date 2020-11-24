package practice.ch7inheritance;

public class VIPCustomer extends Customer {
    private int agentID;// 담당 상담원
    double salesRatio; // VIP 할인율

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
