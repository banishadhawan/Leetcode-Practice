class Solution {
    public int longestOnes(int[] nums, int k) {
      int zero=0, start=0, maxlen=0;

      for(int i=0;i<nums.length;i++){
        if(nums[i]==0) zero++;

        while(zero > k){
            if(nums[start]==0) zero--;

            start++;
        }
        maxlen=Math.max(maxlen,i-start+1);
      }
      return maxlen;
    }
}
