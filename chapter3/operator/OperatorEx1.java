package chapter3.operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        int num1 = -10;
        int num2 = 20;

        System.out.println(+num1);
        System.out.println(-num2);

        System.out.println(num1);
        System.out.println(num2);

        num1 = -num1; // 대입연산자를 통해 부호를 바꿈.
    }
}