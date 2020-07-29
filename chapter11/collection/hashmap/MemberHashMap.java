package chapter11.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member);

    }

    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            System.out.println(memberId + "정상적으로 삭제되었습니다.");
            return true;
        }
        System.out.println(memberId + " 가 없습니다.!");
        return false;
    }

    public void showAllMembers() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
