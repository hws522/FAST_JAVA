package practice.ch7inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerKim = new VIPCustomer(10010, "김유신");
        Customer customerLee = new GoldCustomer(10020, "이순신");
        Customer customerJang = new GoldCustomer(10030, "장보고");
        Customer customerHeo = new Customer(10040, "허준");
        Customer customerHong = new Customer(10050, "홍길동");

        customerList.add(customerKim);
        customerList.add(customerLee);
        customerList.add(customerJang);
        customerList.add(customerHeo);
        customerList.add(customerHong);

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;

        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }
}
