class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int i=0;
        int j=0;
        int [][]matrix=new int[n][m];
        while(i<n && j<m){
            int min=Math.min(rowSum[i],colSum[j]);
            matrix[i][j]=min;
            rowSum[i]-=min;
            colSum[j]-=min;
            if(rowSum[i]==0){
                i++;
            }else{
                j++;
            }
        }
        return matrix;        
    }
}