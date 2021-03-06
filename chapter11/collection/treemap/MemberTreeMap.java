package chapter11.collection.treemap;

import java.util.HashSet;
import java.util.Iterator;

public class MemberTreeMap {

    private HashSet<Member> hashSet;

    public MemberTreeMap() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    //memberId가 같으면 remove
    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberID() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "번호가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
