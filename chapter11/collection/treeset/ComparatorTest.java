package chapter11.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) { // 내림차순으로 바꾸기 위해 재정의.
        return -(o1.compareTo(o2));
    }

}

public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");
        for (String str : treeSet) {
            System.out.println(str); // String 안에 Comparable이 구현되어 있어서 오름차순으로 정렬되어 출력됨.
        }
    }
}
