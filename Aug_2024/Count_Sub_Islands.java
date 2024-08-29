class Solution {
    public boolean dfs(int row,int col,int[][] grid1, int[][] grid2,boolean[][] visited){
        int rows=grid1.length;
        int cols=grid1[0].length;
        visited[row][col]=true;
        boolean isLand=true;
        int [][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
        if(grid1[row][col]==0){
            isLand=false;
        }
        for(int []dir: dirs){
            int nextRow=row+dir[0];
            int nextCol=col+dir[1];
            if( nextRow>=0 && nextCol>=0 && nextRow<rows && nextCol<cols &&
                grid2[nextRow][nextCol]==1 && !visited[nextRow][nextCol]){
                boolean flag=dfs(nextRow,nextCol,grid1,grid2,visited);
                isLand=flag && isLand;
            }
        }
        return isLand;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int rows=grid1.length;
        int cols=grid1[0].length;
        boolean[][] visited=new boolean[rows][cols];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid2[i][j]==1 && !visited[i][j]){
                    // boolean flag=;
                    if(dfs(i,j,grid1,grid2,visited)){
                        count++;
                    }
                }
            }
        }
        return count;        
    }
}