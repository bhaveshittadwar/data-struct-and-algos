package sorting;
import sorting.merge_sort.MergeSort;

public class App {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1, 4, 3, 3, 345, 444, 334, 54, 4543};

        arr = mergeSort.sort(arr);
        mergeSort.printArray(arr);
    }
}
