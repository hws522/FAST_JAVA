package chapter10.string;

public class StringTest2 {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java)); // 두개의 값이 다름. -> 연결이 되면 새로운 메모리를 가리킴.
                                                           // 그래서 계속 연결되는 문자열을 쓸 때는 StringBuilder or StringBuffer.

    }
}
