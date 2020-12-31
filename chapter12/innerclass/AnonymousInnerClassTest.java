package chapter12.innerclass;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 100;
        return new Runnable() { // MyRunnable이 한번밖에, 여기서만 쓰이므로, 생략하고 바로 리턴으로 생성반환 가능. -> 익명 내부 클래스.

            @Override
            public void run() {

                // num += 10;
                // i = 200;
                // 로컬 변수 들이기에 i, num 들은 내부적으로 상수가 되어버림. 그래서 참조는 할 수 있으나, 변경은 할 수 없음.

                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }

        };

    }

    Runnable runner = new Runnable() { // 바로 익명 내부 클래스 생성 가능.

        @Override
        public void run() {
            System.out.println("TEST");
        }

    };
}

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(50);

        outer.runner.run();
        runnable.run();
    }
}
