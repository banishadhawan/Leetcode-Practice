class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum=0, result=0;

        for(int num:nums){
            sum+=num;
            int need = sum-k;

            if(map.containsKey(need)){
                result+=map.get(need);
            }
            
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return result;
      
    }
}


