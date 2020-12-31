package chapter10.string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 인스턴스로 생성됨.

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // 상수풀에 있는 문자열을 가리킴.
    }
}
