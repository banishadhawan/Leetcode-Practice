class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int min=0, max=0;
       for(int weight:weights){
        min = Math.max(min,weight);
        max += weight;
       }

       while(min<=max){
        int mid=min+(max-min)/2;

        int day=1, sum=0;
        for(int w:weights){
            if(sum+w > mid){
                day++;
                sum=0;
            }

            sum+=w;
        }

        if(day > days){
            min=mid+1;
        }
        else max=mid-1;
       }
       return min;    
    }
}
