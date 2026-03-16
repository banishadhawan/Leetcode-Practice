class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(candidates);
       backtrack(candidates,target,0,result,new ArrayList<>());
       return result;
    }

    private void backtrack(int[] candidates,int target, int i,List<List<Integer>>result,List<Integer> current){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target<0 || i>=candidates.length) return;

        current.add(candidates[i]);
        backtrack(candidates,target-candidates[i],i+1,result,current);
        current.remove(current.size()-1);

        int next=i+1;
        while(next<candidates.length && candidates[next]==candidates[i]) next++;

        backtrack(candidates,target,next,result,current);
    }
}