package chapter11.collection.hashmap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap manager = new MemberHashMap();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");
        Member memberPark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2); // Integer 에 이미 equals 와 hashCode가 정의 되어 있기 때문에 중복 ㄴㄴ. 구현할 필요 없음.

        manager.showAllMember();

        manager.removeMember(200);

        manager.showAllMember();
    }
}
