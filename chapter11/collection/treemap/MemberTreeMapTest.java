package chapter11.collection.treemap;

public class MemberTreeMapTest {
    public static void main(String[] args) {

        MemberTreeMap manager = new MemberTreeMap();

        Member memberPark = new Member(300, "Park");
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark2 = new Member(400, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showAllMember(); // Integer에 이미 Comparable이 구현되어 있기 때문. Integer 가 아닐 경우, TreeSet에서 한것처럼 구현 필요.

        manager.removeMember(200);

        manager.showAllMember();
    }
}
