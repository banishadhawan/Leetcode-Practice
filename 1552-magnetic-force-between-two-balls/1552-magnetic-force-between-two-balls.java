public class Solution {
    public int maxDistance(int[] arr, int m) {
       Arrays.sort(arr);
       int n=arr.length;

       int left=1, right=arr[n-1]-arr[0];
       while(left<=right){
        int mid= left+(right-left)/2;
        if(canplace(mid, arr, m)) left=mid+1;
        else right=mid-1;
       }        
       return right;
    }
    private boolean canplace(int mid, int[] arr, int m){
        int balls=1, prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev >= mid){
                balls++;
                prev=arr[i];
            }
        }
        return balls>=m;
    }
}