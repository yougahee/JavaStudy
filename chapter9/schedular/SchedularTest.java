package chapter9.schedular;

import java.util.Scanner;

public class SchedularTest {
    public static void main(String[] args) {
        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        Scheduler scheduler = null;

        if(ch == 'R' || ch ==  'r') {
            scheduler = new RoundRobin();
        }else if(ch == 'L' || ch ==  'l') {
            scheduler = new LeastJob();
        }else if(ch == 'P' || ch ==  'p') {
            scheduler = new PriorityAllocation();
        }


        System.out.println("전화 상담원 할당 방식을 선택하세요");

        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("전화 상담원 할당 방식을 선택하세요");
    }
}
