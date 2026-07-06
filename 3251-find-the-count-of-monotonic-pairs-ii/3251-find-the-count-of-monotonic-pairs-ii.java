class Solution {
    public int countOfPairs(int[] nums) {
        int MOD = 1_000_000_007;
        int n = nums.length;

        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        long[][] dp = new long[n][max + 1];

        for (int a = 0; a <= nums[0]; a++) {
            dp[0][a] = 1;
        }

        for (int i = 1; i < n; i++) {

            long[] prefix = new long[max + 1];
            prefix[0] = dp[i - 1][0];

            for (int j = 1; j <= max; j++) {
                prefix[j] = (prefix[j - 1] + dp[i - 1][j]) % MOD;
            }

            for (int a = 0; a <= nums[i]; a++) {

                int limit = Math.min(a, nums[i - 1] - nums[i] + a);

                if (limit >= 0) {
                    dp[i][a] = prefix[limit];
                }
            }
        }

        long ans = 0;
        for (int a = 0; a <= nums[n - 1]; a++) {
            ans = (ans + dp[n - 1][a]) % MOD;
        }

        return (int) ans;
    }
}