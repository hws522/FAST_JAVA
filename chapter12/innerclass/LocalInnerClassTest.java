package chapter12.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 100;
        class MyRunnable implements Runnable {

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

        }
        return new MyRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();
    }
}
