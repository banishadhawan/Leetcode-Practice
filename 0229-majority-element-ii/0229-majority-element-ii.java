class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> res= new ArrayList<>();

        int n=nums.length;

        for(int num:map.keySet()){
            if(map.get(num) > n/3) res.add(num);
        }

        return res;
    }
}