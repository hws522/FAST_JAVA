package chapter5.staticex;

public class Company {
  
    private static Company instance = new Company();

    private Company() {} //생성자를 생성했기 때문에 defalt 생성자는 만들어지지 않고, private 이기 때문에 외부에서 사용할 수 없음.

    public static Company getInstance() //일반 메서드는 생성이 되어야 사용 할 수 있으므로, 외부로 가져가기 위해 static 으로 만든다. 
    {
        if(instance == null)
        {
            instance = new Company();
        }
        return instance;
    }
}
