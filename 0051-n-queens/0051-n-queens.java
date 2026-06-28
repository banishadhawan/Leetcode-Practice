class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];

        solve(0, board, leftRow, lowerDiagonal, upperDiagonal, n);

        return ans;
    }

    private void solve(int row, char[][] board,
                       int[] leftRow,
                       int[] lowerDiagonal,
                       int[] upperDiagonal,
                       int n) {

        if (row == n) {

            List<String> temp = new ArrayList<>();

            for (char[] r : board) {
                temp.add(new String(r));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (leftRow[col] == 0 &&
                lowerDiagonal[row + col] == 0 &&
                upperDiagonal[n - 1 + col - row] == 0) {

                board[row][col] = 'Q';

                leftRow[col] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                solve(row + 1, board,
                      leftRow,
                      lowerDiagonal,
                      upperDiagonal,
                      n);

                board[row][col] = '.';

                leftRow[col] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }
}