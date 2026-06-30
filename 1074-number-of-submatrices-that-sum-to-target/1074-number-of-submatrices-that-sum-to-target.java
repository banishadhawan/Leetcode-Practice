class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        // Fix left column
        for (int left = 0; left < n; left++) {
            int[] rowSum = new int[m];

            // Expand right column
            for (int right = left; right < n; right++) {

                // Update row sums
                for (int i = 0; i < m; i++) {
                    rowSum[i] += matrix[i][right];
                }

                // Count subarrays with sum = target
                count += subArraySum(rowSum, target);
            }
        }

        return count;
    }

    private int subArraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int num : nums) {
            prefix += num;

            count += map.getOrDefault(prefix - target, 0);

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}