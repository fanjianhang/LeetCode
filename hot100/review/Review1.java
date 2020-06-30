package hot100.review;

import java.util.HashMap;
import java.util.Map;

public class Review1 {

}

class SolutionReview1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Please check args.");
    }
}