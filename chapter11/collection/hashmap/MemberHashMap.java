package chapter11.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) { // 넣을 때도 key-value pair로 넣는다.
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    public void showAllMember() {
        // key와 value를 동시에 순회할 수는 없음. 둘중에 하나를 베이스로 순회.
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
