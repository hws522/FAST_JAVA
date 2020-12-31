package chapter10.string;

public class StringBuilderTest {

    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(android);
        System.out.println(System.identityHashCode(buffer)); // 연결전과 연결후의 buffer hashcode값이 똑같음.

        java = buffer.toString();
        System.out.println(java);
    }
}
