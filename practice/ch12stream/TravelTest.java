package practice.ch12stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println(customerList);

        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);

        customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}

// 패키지 여행을 떠나는 고객들이 있다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원이다.
// 다음과 같이 고객 세명이 여행을 간다고 했을 때, 비용과 고객 명단에 대한 출력을 스트림을 활용하여 만들어 보자.
// 이름 : 이순신, 나이 : 40, 비용 : 100
// 이름 : 김유신, 나이 : 20, 비용 : 100
// 이름 : 홍길동, 나이 : 13, 비용 : 50

// 1. 고객 명단을 출력한다.
// 2. 여행의 총 비용을 계산한다.
// 3. 고객 중 20세 이상인 사람을 이름으로(가나다순)정렬하여 출력한다.