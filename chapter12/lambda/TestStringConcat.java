package chapter12.lambda;

import First.hello.HelloJava;

public class TestStringConcat {
    public static void main(String[] args) {
        
        StringConImpl impl = new StringConImpl();
        impl.makeString("hello", "World!");

        StringConcat concat = (s, v) -> System.out.println(s + ',' + v);
        concat.makeString("hello", "lambda!");

        StringConcat concat2 = new StringConcat(){

            @Override
            public void makeString(String s1, String s2) { // 람다식으로 구현을 하지만 사실 익명내부클래스 생성됨.
                System.out.println(s1 + ',' + s2);
            }
        };

        concat2.makeString("hello", "String");
    }
}
