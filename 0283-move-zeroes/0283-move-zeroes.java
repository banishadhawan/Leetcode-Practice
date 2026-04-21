// class Solution {
//     public void moveZeroes(int[] nums) {
//         int j=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 //swap(nums[i],nums[k])
//                 int temp=nums[j];
//                 nums[j]=nums[i];
//                 nums[i]=temp;
//                 j++;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;

        for(int num:nums){
            if(num!=0){
                nums[i++]=num;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}