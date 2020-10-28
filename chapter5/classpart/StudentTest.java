package chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {
        
        Student studentLee = new Student(); 
        // student 라는 이름의 클래스이름으로 변수를 선언. 변수의 이름은 studentLee. 생성을 한다는 의미로 new. 클래스이름과 동일한 생성자.
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";
        

        studentKim.showStudentInfo();

        System.out.println(studentLee); //참조변수를 직접 출력했을 떄, (참조변수가 가르키고 있는 주소) 참조 값을 알 수 있음.
        System.out.println(studentKim);
    }
}

//생성한 클래스를 이용해 출력해보는 과정이었음.