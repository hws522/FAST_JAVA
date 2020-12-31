package chapter12.innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int iNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInner() {
        inClass.inTest();
    }

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest() {
            // System.out.println(inNum); //여기서는 쓸 수 없다. inNum 은 클래스가 생성된 이후에 만들어지는 변수이기 때문.
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingInner();

        OutClass.InClass myInClass = outClass.new InClass(); // OutClass 내부에서 쓰려고 만든 InClass이기 때문에 실제로 이렇게 쓰는 경우는 거의 없다.
        myInClass.inTest();

        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        // 바로 static class 생성 가능.
        sInClass.inTest();
        OutClass.InStaticClass.sTest();

    }
}
