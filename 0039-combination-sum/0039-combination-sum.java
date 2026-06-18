class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res = new ArrayList<>();
      solve(candidates, target, 0, new ArrayList<>(), res);
      return res;
    }

    public void solve(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target<0) return;

        for(int i=idx;i<candidates.length;i++){
            curr.add(candidates[i]);
            solve(candidates, target-candidates[i], i, curr, res);
            curr.remove(curr.size()-1);
        }
    }
}