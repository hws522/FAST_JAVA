package chapter11.collection.set;

public class Member {

    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public boolean equals(Object obj) { // memberId가 같을 때 같은 값이라는 것이 정의되어 있지 않으므로, 오버라이딩을 통해 정의.
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return (this.memberId == member.memberId);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return memberId;
    }
}
