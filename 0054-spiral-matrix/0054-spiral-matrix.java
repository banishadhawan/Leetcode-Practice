class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if(matrix==null || matrix.length==0) return res;

        int rowB=0,rowE=matrix.length-1;
        int colB=0, colE=matrix[0].length-1;

        while(rowB<=rowE && colB<=colE){
            //right
            for(int j=colB;j<=colE;j++){
                res.add(matrix[rowB][j]);
            }
            rowB++;

            //down
            for(int i=rowB;i<=rowE;i++){
                res.add(matrix[i][colE]);
            }
            colE--;
            
            //left
            if(rowB<=rowE){
                for(int j=colE;j>=colB;j--){
                    res.add(matrix[rowE][j]);
                }
                rowE--;
            }

            //up
            if(colB<=colE){
                for(int i=rowE;i>=rowB;i--){
                    res.add(matrix[i][colB]);
                }
                colB++;
            }
        }
        return res;
    }
}
           