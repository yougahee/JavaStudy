package chapter11.collection.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    //memberId가 같으면 remove
    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberID() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "번호가 존재하지 않습니다.");
        return false;
    }



    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
