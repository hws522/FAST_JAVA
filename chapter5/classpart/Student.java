package chapter5.classpart;

public class Student { //학생에 대한 클래스.
    
    //public 같은 것을 "접근 제어자" 라고 함. 여기서는 안써도 됨. 
    public int studentID; //학번
    public String studentName; //이름
    public String address; //주소

    public Student() {} //기본 생성자.
    //기본 생성자를 호출하지 않고 디폴트로 생성하려면 
    //아래의 생성자가 없어야 한다.
    //아래의 생성자를 그대로 쓰려면,  
    //StudentTest 에서 기본 생성자로 호출했기 때문에, 
    //new Student(매개변수)생성자 안에 매개변수를 넣어주어야 오류가 나지 않는다.

    public Student(int id, String name)
    {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    } //생성자 구현.

    public void showStudentInfo() //method.
    {
        System.out.println(studentName + ',' + address);
    }
}



/*
자바파일 이름이랑 클래스 이름은 동일해야 한다. 
자바파일하나에 클래스는 주로 하나만 들어가는데, 두개 이상이 될 경우가 있다.
이때 public 이라는 키워드를 가진 클래스는 파일에 하나뿐이어야 한다. 
그리고 public class와 자바파일이름이 동일해야한다. 
나머지 클래스들은 상관 없다. 

클래스에 메인은 없는것이 대부분. 
 */