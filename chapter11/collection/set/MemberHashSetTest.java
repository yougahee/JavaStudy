package chapter11.collection.set;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberSu = new Member(300, "Su");
        Member memberSu2 = new Member(300, "Su2");

        manager.addMember(memberKim);
        manager.addMember(memberLee);
        manager.addMember(memberSu);
        manager.addMember(memberSu2);

        manager.showAllMember();

        manager.removeMember(100);
        manager.showAllMember();
    }
}
