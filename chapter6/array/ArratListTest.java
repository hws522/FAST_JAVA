package chapter6.array;

import java.util.ArrayList;

public class ArratListTest {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i < list.size(); i++) //size 와 length의 차이는 length는 배열의 길이. element가 몇개가 들어갔는지 상관없이 배열의 전체 길이를 말함.
                                            //size는 배열에 들어간 element의 갯수. 
        {
            String str = list.get(i);
            System.out.println(str);
        }

        for(String s : list)
        {
            System.out.println(s);
        }
    }
}
