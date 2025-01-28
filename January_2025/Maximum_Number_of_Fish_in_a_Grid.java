class Solution {
    public int findMaxFish(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int maxFish=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    maxFish=Math.max(maxFish,dfs(i,j,grid));
                }
            }
        }
        return maxFish;
    }
    public int dfs(int r,int c,int grid[][]){
        if(r<0 || r>grid.length-1 || c<0 || c>grid[0].length-1 || grid[r][c]==0){
            return 0;
        }
        int ans=grid[r][c];
        grid[r][c]=0;
        ans+=dfs(r-1,c,grid)+dfs(r,c+1,grid)+dfs(r+1,c,grid)+dfs(r,c-1,grid);
        return ans;
    }
}