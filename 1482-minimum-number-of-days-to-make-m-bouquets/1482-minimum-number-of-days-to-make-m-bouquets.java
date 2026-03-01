class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if((long)m*k > bloomDay.length) return -1;

       int left=0,right=0;
       for(int num:bloomDay){
        left = Math.min(left,num);
        right = Math.max(right,num);
       }

       while(left<=right){
        int mid=left+(right-left)/2;

        if(canmake(mid,bloomDay,k)>=m) right=mid-1;
        else left=mid+1;
       }
       return left;
    }

    private int canmake(int mid, int[] bloomDay, int k){
        int flow=0;
        int boq=0;
        for(int num:bloomDay){
            if(num <= mid){
                flow++;
                if(flow==k){
                    boq++;
                    flow=0;
                }
            }
            else{
                flow=0;
            }
        }
        return boq ;
    }
}