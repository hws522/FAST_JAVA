package practice.ch9interface;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택하세요.");
        System.out.println("Q : Quick Sort");
        System.out.println("B : Bubble Sort");
        System.out.println("H : Heap Sort");

        int[] arr = { 1, 2, 3, 4, 5 };
        int ch = System.in.read();
        Sort sort = null;

        if (ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        } else if (ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        } else if (ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        } else {
            System.out.println("잘못된 방식입니다.");
            return;
        }

        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}
