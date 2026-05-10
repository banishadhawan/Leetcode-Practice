class Solution {
    public int findMin(int[] nums) {
        // int n=nums.length;
        // int min=nums[0];
        // for(int i=0;i<n;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        // return min;


        int n = nums.length;

        int low=0, high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else high=mid;
        }
        return nums[low];
    }
}
 
  