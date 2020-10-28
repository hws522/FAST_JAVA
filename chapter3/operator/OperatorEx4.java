package chapter3.operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);

        System.out.println(num1);
        System.out.println(i); // 단락회로평가. 앞의 항의 결과만 있어도 논리값이 정해지는 경우 오류가 발생 할 수 있다. 

        System.out.println(value);

        int num2 = 10;
        int num3 = 20;

        int max = (num2 > num3) ? num2 : num3; //삼항 연산자. 

        System.out.println(max); 
    }
}