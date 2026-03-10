class Solution {
    public int findKthPositive(int[] arr, int k) {
       int left=0, high=arr.length-1;
       while(left<=high){
        int mid=left+(high-left)/2;
        int missing = arr[mid] - (mid+1);
        if(missing < k) left=mid+1;
        else high=mid-1;
       }
       return left+k;
    }
}
