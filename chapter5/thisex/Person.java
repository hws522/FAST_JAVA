package chapter5.thisex;

public class Person {
    
    String name;
    int age;

    public Person()
    {
        //this.name = "이름없음";
        this("이름 없음", 1); //초기값이라고 봐도 됨.
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void showInfo()
    {
        System.out.println(name + " , " + age);
    }

    public Person getSelf()
    {
        return this; //자신의 주소를 반환함. 반환타입은 자신의 클래스 타입.
    }
}
