class Solution {
    public int findRowSum(int[][] grid,int r,int c){
        int sum=0;
        boolean visited[]=new boolean[10];
        for(int i=0;i<3;i++){
            int rowSum=0;
            for(int j=0;j<3;j++){
                int val=grid[r+i][c+j];
                if(val==0 || val>=10 || visited[val]){
                    return -1;
                }
                visited[val]=true;
                rowSum+=val;
            }
            if(i==0){
                sum=rowSum;
            }else{
                if(sum!=rowSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public int findColSum(int[][] grid,int r,int c){
        int sum=0;
        for(int j=0;j<3;j++){
            int colSum=0;
            for(int i=0;i<3;i++){
                int val=grid[r+i][c+j];
                colSum+=val;
            }
            if(j==0){
                sum=colSum;
            }else{
                if(sum!=colSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public int findDiagonalSum(int[][] grid,int r,int c){
        int d1=grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2];
        int d2=grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c];
        if(d1==d2){
            return d1;
        }
        return -1;
    }
    public boolean isMagicSquare(int[][] grid,int r,int c){
        int rowSum=findRowSum(grid,r,c);
        if(rowSum==-1) return false;
        int colSum=findColSum(grid,r,c);
        if(colSum==-1) return false;
        int diagonalSum=findDiagonalSum(grid,r,c);
        if(diagonalSum==-1) return false;
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(isMagicSquare(grid,i,j)){
                    count++;
                }
            }
        }
        return count;        
    }
}