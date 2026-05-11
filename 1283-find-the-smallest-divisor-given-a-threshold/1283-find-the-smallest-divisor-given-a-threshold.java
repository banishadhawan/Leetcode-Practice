class Solution {
   
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1, max=0;
        for(int num:nums){
            if(num>max)
                max=Math.max(max,num);
        }
        int high=max;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(sum(mid,nums)<=threshold){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    int sum(int mid, int[] nums){
        int sum=0;
       for(int num:nums){
        sum += (num+mid-1)/mid;
       }
       return sum;

    }

}