class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      //formula =>  row=mid/size,  col=mid%size
      int row = matrix.length;
      int col = matrix[0].length;

    //flatten the 2d matrix into 1d matrix = [1,3,5,7,10,11,16,20,23,30,34,60]
      int low=0, high=row*col-1; //last 
      while(low<=high){
        int mid=(low+high)/2;
        int r=mid/col;
        int c=mid%col;

        if(matrix[r][c]==target) return true;
        else if(matrix[r][c]<target) low=mid+1;
        else high=mid-1;
      }
        return false;
      
    }
}

