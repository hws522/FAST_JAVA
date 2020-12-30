package chapter9.interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        CompleteCalc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));

        calc.description();

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Calc.total(arr); // static 으로 생성해놓으면, 인스턴스 생성과 상관없이 가져다 쓸 수 있음.
        System.out.println(sum);
    }
}
