class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = Integer.MIN_VALUE;

        // Iterate over smaller dimension for better complexity
        if (m > n) {
            // Compress columns
            for (int left = 0; left < n; left++) {
                int[] rowSum = new int[m];

                for (int right = left; right < n; right++) {
                    for (int i = 0; i < m; i++) {
                        rowSum[i] += matrix[i][right];
                    }

                    ans = Math.max(ans, maxSubArrayNoMoreThanK(rowSum, k));
                    if (ans == k) return k;
                }
            }
        } else {
            // Compress rows
            for (int top = 0; top < m; top++) {
                int[] colSum = new int[n];

                for (int bottom = top; bottom < m; bottom++) {
                    for (int j = 0; j < n; j++) {
                        colSum[j] += matrix[bottom][j];
                    }

                    ans = Math.max(ans, maxSubArrayNoMoreThanK(colSum, k));
                    if (ans == k) return k;
                }
            }
        }

        return ans;
    }

    private int maxSubArrayNoMoreThanK(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);

        int prefix = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            prefix += num;

            Integer target = set.ceiling(prefix - k);
            if (target != null) {
                max = Math.max(max, prefix - target);
            }

            set.add(prefix);
        }

        return max;
    }
}