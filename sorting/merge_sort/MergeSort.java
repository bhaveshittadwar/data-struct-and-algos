package sorting.merge_sort;

public class MergeSort {
    public int[] slice(int[] arr, int start, int end) {
        int[] result = new int[end-start];
        for (int i = 0; i < end - start; i++) {
            result[i] = arr[start + i];
        }
        return result;
    }


    // REDO MERGE FUNCTION - It's breaking
    public int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstPtr = 0;
        int secondPtr = 0;
        int count = 0;
        while (!(firstPtr == first.length && secondPtr == second.length)) {
            if (firstPtr != first.length && secondPtr != second.length && first[firstPtr] <= second[secondPtr]) {
                result[count] = first[firstPtr];
                firstPtr++;
            } else {
                result[count] = second[secondPtr];
                secondPtr++;
            }
            count++;
        }
        return result;
    }

    public int[] sort(int arr[]) {
        int start = 0;
        int end = arr.length;
        int[] result;
        // 1. If single element do nothing
        if (arr.length == 1) return arr;
        // 2. Calculate half
        int mid = (start + end)/2;
        // 3. Recursively sort left half
        int first[] = slice(arr, start, mid);
        first = sort(first);
        // 4. Recursively sort right half
        int second[] = slice(arr, mid ,end);
        second = sort(second);
        // 5. Merge two halves
        result = merge(first, second);
        return result;
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
