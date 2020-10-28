package chapter5.staticex;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        
        Company company1 = Company.getInstance();

        Company company2 = Company.getInstance();

        System.out.println(company1); //동일한 주소를 가진 것을 확인 할 수 있음.
        System.out.println(company2); //100번을 불러도 같은 값을 사용한다는 뜻.

        Calendar calendar = Calendar.getInstance(); //new로 부르면 생성 안됨. 날짜, 타임존에 대한 걸 가지고 있는데 유일한 값이기 때문에.
                                                    //싱글톤 패턴.
    }
}
