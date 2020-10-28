package chapter3.operator;

public class OperatorEx5 {
    public static void main(String[] args) {
        int num1 = 0B00001010; // 10
        int num2 = 0B00000101; // 5

        System.out.println(num1 & num2); //둘다 1인 비트가 없으니 0.
        System.out.println(num1 | num2); //둘다 0이어야 0이니까 00001111되서 15.
        System.out.println(num1 ^ num2); //서로 다른부분 1로. 00001111.

        System.out.println(num2 << 1); // 한번 왼쪽으로 밀었음. 2를 곱한 것.
        System.out.println(num2 << 3); // 세번 왼쪽으로 밀었음. 2의 3제곱을 곱함. 
        System.out.println(num2 >> 2); // 두번 오른쪽으로 밀었음. 2의 2제곱을 나눔. 
    }
}