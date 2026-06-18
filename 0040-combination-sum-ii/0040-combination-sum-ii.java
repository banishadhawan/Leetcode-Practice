class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(candidates);
       solve(candidates, target, new ArrayList<>(), 0, res);
       return res;
    }

    public void solve(int[] candidates, int target, List<Integer> curr, int idx, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target<0) return;

        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;

            if(candidates[i]>target) break;

            curr.add(candidates[i]);
            solve(candidates,target-candidates[i], curr, i+1, res);
            curr.remove(curr.size()-1);
        }
    }
}