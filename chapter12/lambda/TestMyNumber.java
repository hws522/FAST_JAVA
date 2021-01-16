package chapter12.lambda;

public class TestMyNumber {
    
    public static void main(String[] args) {
        // 원래는 클래스를 생성하고 그 클래스에 인스턴스를 생성하고 참조변수를 통해서 메서드를 호출.
        MyMaxNumber max = (x, y) -> (x >= y)? x : y; 
        // 함수이름은 익명으로 쓰지 않고 ( 그래서 메서드는 하나만 있어야 함)

        System.out.println(max.getMaxNumber(10, 20));
    }

    
}
