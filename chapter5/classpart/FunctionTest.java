package chapter5.classpart;

public class FunctionTest {

    public static int addNum(int num1, int num2)
    {
        int result;
        result = num1 + num2;
        return result;
    } 
    public static void main(String[] args) {
        
        int n1, n2, result;
        n1 = 10;
        n2 = 5;

        result = addNum(n1, n2);

        System.out.println(result);
    }
}
