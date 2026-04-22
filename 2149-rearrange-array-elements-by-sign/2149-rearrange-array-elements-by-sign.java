class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int posidx = 0;   //pos starts from 0 indx
        int negidx = 1;   //neg starts from 1 idx

        for(int num:nums){
            if(num>0){
                res[posidx] = num;
                posidx += 2;
            }
            else{
                res[negidx] = num;
                negidx += 2;
            }
        }
        return res;

    }
}