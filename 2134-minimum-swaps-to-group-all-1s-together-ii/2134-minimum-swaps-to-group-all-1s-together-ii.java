class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        int n = nums.length;

        // Count total number of 1's
        for (int num : nums) {
            ones += num;
        }

        if (ones <= 1) return 0;

        // Count zeros in the first window
        int zeros = 0;
        for (int i = 0; i < ones; i++) {
            if (nums[i] == 0) zeros++;
        }

        int minSwaps = zeros;

        // Slide the window over the circular array
        for (int i = ones; i < n + ones; i++) {
            if (nums[(i - ones) % n] == 0) zeros--;
            if (nums[i % n] == 0) zeros++;

            minSwaps = Math.min(minSwaps, zeros);
        }

        return minSwaps;
    }
}