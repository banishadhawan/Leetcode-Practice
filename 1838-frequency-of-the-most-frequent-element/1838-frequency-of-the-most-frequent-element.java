class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left=0, ans=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while((long) (i-left+1) * nums[i] - sum > k){
                sum -=  nums[left];
                left++;
            }

            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}