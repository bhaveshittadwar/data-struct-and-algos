package sorting.selection_sort;

public class SelectionSort {
    public int[] sort (int arr[]) {
        int len = arr.length;
        int min = 0;
        int temp;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
