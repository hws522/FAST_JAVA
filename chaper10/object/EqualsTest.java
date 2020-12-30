package chaper10.object;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public boolean equals(Object obj) { // 재정의
        if (obj instanceof Student) {
            Student std = (Student) obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {

        // String str1 = new String("abc");
        // String str2 = new String("abc");

        // System.out.println(str1 == str2); // 두 개의 메모리 주소가 같은가? -> false
        // System.out.println(str1.equals(str2)); // 두 개의 문자열이 같은가? -> true

        Student studentLee = new Student(100, "이순신");
        Student studentLee2 = studentLee;
        Student studentShin = new Student(100, "이순신");

        System.out.println(studentLee == studentShin);
        System.out.println(studentLee.equals(studentShin)); // 재정의 필요.

        System.out.println(studentLee.hashCode());
        System.out.println(studentShin.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

    }
}
