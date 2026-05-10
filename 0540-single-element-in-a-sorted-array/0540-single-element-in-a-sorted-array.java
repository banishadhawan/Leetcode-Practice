class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
         for(int num:nums){
              xor = xor^num;
         }
         return xor;
    }
}



// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int left = 0, right = nums.length - 1;
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             // Ensure mid is even (so we compare with its pair)
//             if (mid % 2 == 1) mid--; 
//             // If mid and mid+1 are same, single element is on the right
//             if (nums[mid] == nums[mid + 1]) left = mid + 2;
//             else right = mid;
//             // Otherwise, single element is on the left (including mid)
//         }
//         return nums[left]; // At the end, left == right pointing to the single element
//     } 
// }
