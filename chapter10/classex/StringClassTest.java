package chapter10.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class c1 = String.class;

        // String str = new String();
        // Class c2 = str.getClass();

        Class c3 = Class.forName("java.lang.String");

        Constructor[] cons = c3.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        System.out.println();

        Method[] methods = c3.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }
}

// Class 클래스 가져오기.
// 1. String s = new String();
// Class c = s.getClass();

// 2. Class c = String.class;
// 3. Class c = Class.forName("java.lang.String"); // 동적로딩
