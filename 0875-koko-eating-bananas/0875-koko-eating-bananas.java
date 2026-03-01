class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, max=0;
        int ans=0;

        for(int num:piles){
            if(num>max) max=num;
        }
        int right=max;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(caneat(mid,piles,h)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean caneat(int mid, int[] piles, int h){
        long sum=0;
        for(int num:piles){
            sum+=num/mid;
            if(num%mid !=0) sum++;
        }
        return sum <= h;
    }
}