class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> arr=new ArrayList<>();
        int rMinMax=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int rowMin=matrix[i][0];
            for(int j=0;j<n;j++){
                rowMin=Math.min(rowMin,matrix[i][j]);
            }
            rMinMax=Math.max(rowMin,rMinMax);

        }
        for(int i=0;i<n;i++){
            int colMax=matrix[0][i];
            for(int j=0;j<m;j++){
                colMax=Math.max(colMax,matrix[j][i]);
            }
            if(colMax==rMinMax){
                arr.add(colMax);
            }
        }
        return arr;
        
    }
}