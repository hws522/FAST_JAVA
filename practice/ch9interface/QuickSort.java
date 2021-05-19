package practice.ch9interface;

public class QuickSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending.");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending.");
    }

}
