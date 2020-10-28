package chapter5.classpart;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderNumber = "201907210001";
        order.orderId = "abc123";
        order.orderYmd = "2019년 7월 21일";
        order.orderName = "홍길순";
        order.orderProduct = "PD0345-12";
        order.orderAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호 : " + order.orderNumber);
        System.out.println("주문자 아이디 : " + order.orderId);
        System.out.println("주문 날짜 : " + order.orderYmd);
        System.out.println("주문자 이름 : " + order.orderName);
        System.out.println("주문 상품 번호 : " + order.orderProduct);
        System.out.println("배송주소 : " + order.orderAddress);
    }
}
