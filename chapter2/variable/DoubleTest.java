package chapter2.variable;

public class DoubleTest {
    public static void main(String[] args){
        
        double dNum = 3.14; // 3.14는 자바내부에서 더블타입으로 저장됨. 

        float fNum = 3.14F; //3.14는 내부적으로 더블타입으로 저장되기때문에, float으로 갈때는 3.14f라고 f식별자 사용해야함. long, int와 마찬가지로 대소문자 모두 가능.

        System.out.println(dNum);
        System.out.println(fNum);
    }
}