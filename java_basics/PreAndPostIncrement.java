package java_basics;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2};
        int i = 0;
        int j = 99;
        arr1[++i] = j++;
        arr1[++i] = j++;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
