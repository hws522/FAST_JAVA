package chapter11.collection.treemap;

import java.util.TreeMap;
import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) { // 넣을 때도 key-value pair로 넣는다.
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    public void showAllMember() {
        // key와 value를 동시에 순회할 수는 없음. 둘중에 하나를 베이스로 순회.
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
