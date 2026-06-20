class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(solve(board, word, i, j, 0))
                return true;
            }
        }
        return false;
    }

    public boolean solve(char[][] board, String word, int r, int c, int idx){
        if(idx==word.length()) return true;

        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c] != word.charAt(idx)) return false;

        char temp =board[r][c];
        board[r][c] = '*';

        boolean found = solve(board, word, r+1, c, idx+1)||
                        solve(board, word, r-1, c, idx+1)||
                        solve(board, word, r, c+1, idx+1)||
                        solve(board, word, r, c-1, idx+1);
                
        board[r][c]=temp;
        return found;
    }
}

   