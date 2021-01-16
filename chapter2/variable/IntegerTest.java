package chapter2.variable;

public class IntegerTest {
    public static void main(String[] args)
    {
        byte bs = 127; //byte 범위 예.

        System.out.println(bs);

        //int iVal = 12345678900; 범위를 벗어남.
        //long lVal = 12345678900; 변수형과는 별개로 java는 내부적으로 숫자 문자들을 관리하는데, 숫자자체를 바로 int , 4byte 기준으로 핸들링함. 그래서 범위를 벗어남. 
        long lVal = 12345678900L; //L을 붙여서 long으로 취급하게 함. 대소문자 상관은 없으나, 헷갈림을 방지하려고 대문자.

        System.out.println(lVal);

        
    }
}
