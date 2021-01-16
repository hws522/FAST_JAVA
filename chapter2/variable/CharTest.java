package chapter2.variable;

public class CharTest {
    public static void main(String[] args){
        char ch = 'A';

        System.out.println(ch);
        System.out.println((int)ch);

        int iCh = 66;
        System.out.println(iCh);
        System.out.println((char)iCh);

        //char ch2 = -66; 음수는 안됨.

        char hangul = '\uAC00';
        System.out.println(hangul);

        char ch2 = '가';
        System.out.println(ch2);
    }
}