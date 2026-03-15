class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,dp,n,0);
    }
    private int solve(int[] nums,int[] dp,int n,int i){
    if(i>=n) return 0;
    if(dp[i]!=-1) return dp[i];
    return dp[i] = Math.max(solve(nums,dp,n,i+1),nums[i]+solve(nums,dp,n,i+2));
    }
}