package chapter11.collection.set;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");
        Member memberPark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2); // String은 이미 정의 되어 있으나, memberId에 대한 논리적으로 같다는 부분은 정의 되어있지 않음. 재정의 필요.

        manager.ShwAllMember();

        manager.removeMember(100);
        manager.ShwAllMember();
    }
}
