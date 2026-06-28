class Solution {
    public List<List<String>> solveNQueens(int n) {
      
      List<List<String>> ans = new ArrayList<>();

      char[][] board = new char[n][n];

      for(char[] r : board){
        Arrays.fill(r,'.');
      }

      boolean[] leftrow = new boolean[n];
      boolean[] lowerdiag = new boolean[2*n-1];
      boolean[] upperdiag = new boolean[2*n-1];

    
    backtrack(0,board, ans, leftrow, lowerdiag, upperdiag, n);

    return ans;
    }

    private void backtrack(int row, char[][] board, List<List<String>> ans, boolean[] leftrow, boolean[] lowerdiag, boolean[] upperdiag,int n){

        if(row == n){
            List<String> temp = new ArrayList<>();

            for(char[] r : board){
                temp.add(new String(r));
            }

            ans.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
        if(!leftrow[col] && !lowerdiag[row+col] && !upperdiag[n-1 + col-row]){

            board[row][col]='Q';

            leftrow[col]=true;
            lowerdiag[row+col]=true;
            upperdiag[n-1 + col-row]=true;

            backtrack(row+1, board, ans, leftrow, lowerdiag, upperdiag,n);

            board[row][col] = '.';

            leftrow[col]=false;
            lowerdiag[row+col]=false;
            upperdiag[n-1 + col-row]=false;
        }
        }
    }
}
 
