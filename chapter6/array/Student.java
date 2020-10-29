package chapter6.array;

import java.util.ArrayList;

public class Student {
 
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList; //과목을 하나씩 생성하는것이 아니라, ArrayList로 관리.

    public Student(int studentID, String studentName) //student 생성자.
    {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score)
    {
        Subject subject = new Subject(name, score); //생성해서 사용.
        
        subjectList.add(subject);
    }

    public void showStudentInfo()
    {
        int total = 0;

        for(Subject subject : subjectList)
        {
            total += subject.getScore();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
