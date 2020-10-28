package chapter5.reference;

public class Student {
    int studentID;
    String studentName;
    Subject korea; //만들어진 참조 자료형 Subject.
    Subject math;

    //String 은 문자열의 특성상 상수값을 바로 가져와서 쓸 수 있지만,
    //다른 객체들은 생성을 해서 사용해야한다.
    //주로 생성자로 초기화 한다.
    //다른 방법도 있으나, 사용전에 값을 넣으면 널포인트 익셉션. 메모리가 없는데 값을 넣으면 에러가 나기 때문에, 
    //안전한 방법으로 생성자에서 초기화 한다.
    public Student(int id, String name) //저번에 배운 생성자 적용.
    {
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score)
    {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score)
    {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore()
    {
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점 : " + total + " 입니다.");
    }
}
