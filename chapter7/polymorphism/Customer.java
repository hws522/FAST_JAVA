package chapter7.polymorphism;

public class Customer {

    protected int customerID; // private 는 상속되더라도 기능을 쓸 수 없음. 하위클래스는 기능은 쓸 수 있는 protected 를 쓴다.
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // public Customer() //기본 생성자.
    // {
    // customerGrade = "SILVER";
    // bonusRatio = 0.01;
    // }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) // 가격계산. 돈을 받았을 때 지불할 금액을 반환.
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + " 이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCoustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
