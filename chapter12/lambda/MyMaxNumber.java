package chapter12.lambda;

@FunctionalInterface //함수형 인터페이스. 람다식을 위한 인터페이스.
public interface MyMaxNumber {
    int getMaxNumber(int x, int y); // 함수형 인터페이스는 메서드는 하나만 선언해야함. 
}
