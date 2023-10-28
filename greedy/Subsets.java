package greedy;
import java.util.List;
import java.util.ArrayList;

class Subsets {
    static List<List<Integer>> result = new ArrayList<>();
    static int k;

    public static void backtrack(int start, List<Integer> current, int[] nums) {
        if(current.size() == k) {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(i+1, current, nums);
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> subset(int[]nums) {
        for (k = 0; k <= nums.length; k++) backtrack(0, new ArrayList<Integer>(), nums);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 34, 42};
        subset(nums);
        for (List<Integer> list: result) {
            System.out.println(list);
        }
    }
}