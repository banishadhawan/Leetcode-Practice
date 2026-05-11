class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1, max=0;

       for(int num:piles){
        if(num>max) max=num;
       }
       int high=max;
       int ans=0;

       while(low<=high){
        int mid=low+(high-low)/2;

        if(caneat(mid,piles,h)){
            ans=mid;
            high=mid-1;
        }
        else low=mid+1;
       }
       return ans;
    }

    boolean caneat(int mid, int[] piles, int h){
        long sum=0;
        for(int num:piles){
            sum += num/mid;
            if(num%mid != 0) sum++;
        }
         return sum<=h;
    }
}


