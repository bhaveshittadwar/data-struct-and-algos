package sorting.merge_sort;

public class MergeSort {
    // Get the subarray as a new array
    public int[] slice(int[] arr, int start, int end) {
        int[] result = new int[end-start];
        for (int i = 0; i < end - start; i++) {
            result[i] = arr[start + i];
        }
        return result;
    }

    // REVIEW MULTIPLE TIMES
    public int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstPtr = 0;
        int secondPtr = 0;
        int count = 0;
        // For the minimum number of terms out of the two arrays, merge the two arrays
        while (firstPtr < first.length && secondPtr < second.length) {
            if (first[firstPtr] <= second[secondPtr]) {
                result[count++] = first[firstPtr++];
            } else {
                result[count++] = second[secondPtr++];
            }
        }
        // For the remaining elements(if any) concatenate the first array to result
        while (firstPtr < first.length) {
            result[count++] = first[firstPtr++];
        }
        // For the remaining elements(if any) concatenate the second array to result
        while(secondPtr < second.length) {
            result[count++] = second[secondPtr++];
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
