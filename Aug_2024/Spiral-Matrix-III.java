class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][]direction={{0,1},{1,0},{0,-1},{-1,0}};
        int n=rows*cols;
        int res[][]=new int[n][2];
        res[0][0]=rStart;
        res[0][1]=cStart;
        int steps=1;
        int count=1;
        int index=0;
        while(count<n){
            for(int i=0;i<2;i++){
                int dirRow=direction[index%4][0];
                int dirCol=direction[index%4][1];
                for(int j=0;j<steps;j++){
                    rStart+=dirRow;
                    cStart+=dirCol;
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        res[count][0]=rStart;
                        res[count][1]=cStart;
                        count++;
                    }
                }
                index++;
            }
            steps++;
        }
        return res;

    }
}