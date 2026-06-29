import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // remainder 0 before the array starts

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int rem = prefixSum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) {
                    return true;
                }
            } else {
                // Store only the first occurrence of the remainder
                map.put(rem, i);
            }
        }

        return false;
    }
}