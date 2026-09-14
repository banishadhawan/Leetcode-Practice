import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int n = nums.length;

       int closest = nums[0]+nums[1]+nums[2];

       for(int i=0;i<n-2;i++){
        int j=i+1,k=n-1;
        while(j<k){
            int current = nums[i]+nums[j]+nums[k];
            if(Math.abs(target-current) < Math.abs(target-closest)){
                closest = current;
            }

            if(current < target) j++;
            else if(current > target) k--;
            else return current;
        }
       }
       return closest;
    }
}

