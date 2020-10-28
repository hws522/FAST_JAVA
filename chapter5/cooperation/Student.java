package chapter5.cooperation;

public class Student {
    
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) //초기화.
    {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) //협업이 일어나는 부분
    {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) //협업이 일어나는 부분
    {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi)
    {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo()
    {
        System.out.println(studentName + "님의 남은돈은 " + money + "원 입니다.");
    }
}
