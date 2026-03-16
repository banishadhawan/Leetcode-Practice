class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> result=new ArrayList<>();
       backtrack(k,n,1,result,new ArrayList<>());
       return result;
    }

    private void backtrack(int k, int target,int idx,List<List<Integer>>result,List<Integer>current){
        if(current.size()==k && target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(current.size()>k || target<0)return;

        for(int i=idx;i<=9;i++){
            current.add(i);
            backtrack(k,target-i,i+1,result,current);
            current.remove(current.size()-1);
        }
    }
}
  