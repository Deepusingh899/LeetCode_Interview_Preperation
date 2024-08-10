class Solution {
    int rows;
    int cols;
    int [][]diagonal={
        {-1,0},{0,1},{1,0},{0,-1}
    };
    public void dfs(int row,int col, int[][] matrix){
        if(row<0 || row>=rows || col<0 || col>=cols || matrix[row][col]==1){
            return ;
        }
        matrix[row][col]=1;
        for(int i=0;i<4;i++){
            dfs(row+diagonal[i][0],col+diagonal[i][1],matrix);
        }

    }
    public int regionsBySlashes(String[] grid) {
        int n=grid.length;
        rows=n*3;
                cols=n*3;
        int matrix[][]=new int[n*3][n*3];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int row=i*3;
                int col=j*3;
                if(grid[i].charAt(j)=='/'){
                    matrix[row][col+2]=1;
                    matrix[row+1][col+1]=1;
                    matrix[row+2][col]=1;
                }else if(grid[i].charAt(j)=='\\'){
                    matrix[row][col]=1;
                    matrix[row+1][col+1]=1;
                    matrix[row+2][col+2]=1;
                }
            }
        }

        int count=0;
        for(int i=0;i<n*3;i++){
            for(int j=0;j<n*3;j++){
                if(matrix[i][j]==0){
                    dfs(i,j,matrix);
                    count++;
                }
            }
        }
        return count;
        
    }
}