class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        int count=0,sum=0;
            map.put(0,1);

        for(int c:nums){
            sum+=c;

            if(map.containsKey(sum-goal)){
                count += map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
