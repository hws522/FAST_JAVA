package chapter9.interfaceex;

public class CompleteCalc extends Calculator { // Calculator 에서 구현하지 않은 나머지 구현.

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        } else
            return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }

}
