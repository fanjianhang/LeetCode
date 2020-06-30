import java.util.ArrayList;

public class Problem724 {
    public static void main(String[] args) {
        Solution724 solution = new Solution724();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int result = solution.pivotIndex(nums);
        System.out.println(result);
    }
}

class Solution724 {

    public static void test() {
        System.out.println("test");
    }

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        ArrayList<Integer> pivotIndexs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // i is the index
            int leftSum = 0, rightSum = 0;
            for (int left = 0; left < i; left++) {
                leftSum += nums[left];
            }
            for (int right = nums.length - 1; i < right; right--) {
                rightSum += nums[right];
            }
            if (leftSum == rightSum) {
                pivotIndexs.add(i);
            }
        }
        if (!pivotIndexs.isEmpty()) {
            return pivotIndexs.get(0);
        }
        return -1;
    }
}