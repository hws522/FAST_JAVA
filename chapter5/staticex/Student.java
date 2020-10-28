package chapter5.staticex;

public class Student { 

    private static int serialNum = 1000; //다른 클래스에서 값을 변경할 수 있기 때문에, private으로 설정하고 getter setter를 이용한다.
    private int studentID; //학번
    public String studentName; //이름
    public String address; //주소

    public Student(String name) 
    {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    } //기본 생성자.
   
    public Student(int id, String name)
    {
        studentID = id;
        studentName = name;
        address = "주소 없음";
        serialNum++;
        studentID = serialNum;
    } //생성자 구현.

    public void showStudentInfo() 
    {
        System.out.println(studentName + ',' + address);
    }

    public int getStudentID() //일반 인스턴스 메서드에서 static 메서드를 사용하는게 문제가 없는 이유는 , static 변수는 그 이전에 생성되기 때문.
    {
        //serialNum++;
        return studentID;
    }

    public static int getSerialNum() //static 메서드 안에서는 인스턴스 변수를 쓸 수 없다. static 메서드는 인스턴스호출과 무관하게 사용가능하기 때문에.
                                    //인스턴스가 new 되어야 쓸 수 있는 인스턴스 변수는 사용 못하는 것.
    {
        return serialNum;
    }

    public static void setSerialNum(int serialNum)
    {
        Student.serialNum = serialNum;
    }


}

