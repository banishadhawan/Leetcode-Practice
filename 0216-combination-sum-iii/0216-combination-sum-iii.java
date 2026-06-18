class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res= new ArrayList<>();
      solve(k,n,1,new ArrayList<>(),res);
      return res;
    }

    public void solve(int k, int n, int idx, List<Integer> curr, List<List<Integer>> res){
        if(curr.size()==k && n==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(curr.size() > k || n<0) return;

        for(int i=idx;i<=9;i++){
            curr.add(i);
            solve(k,n-i,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
        
    }
}

   