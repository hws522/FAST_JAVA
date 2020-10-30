package Chapter2.variable;

public class BooleanTest {
    public static void main(String[] args) {
        boolean isMarried = false;

        System.out.println(isMarried);

        var i = 10;
        System.out.println(i); //java10 부터 제공하는 기능. 타입을 따로 지정하지 않아도 컴파일러가 자동으로 설정해줌. 
    }
}