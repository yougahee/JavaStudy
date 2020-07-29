package chapter11.collection.treeset;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberSu = new Member(300, "Su");

        manager.addMember(memberKim);
        manager.addMember(memberLee);
        manager.addMember(memberSu);

        manager.showAllMember();

    }
}
