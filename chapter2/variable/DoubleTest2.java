package chapter2.variable;

public class DoubleTest2 {
    public static void main(String[] args) {
        
        double dNum = 1;

        for(int i = 0; i < 10000; i++)
        {
            dNum = dNum + 0.1;
        }

        System.out.println(dNum); //부동소수점의 오류를 알 수 있음. 오차가 존재 한다. 
    }
}