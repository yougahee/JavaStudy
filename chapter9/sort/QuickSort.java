package chapter9.sort;

public class QuickSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println("Quick sort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("Quick sort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
