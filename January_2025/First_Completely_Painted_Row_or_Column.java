class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int rowCount[]=new int[n];
        int colCount[]=new int [m];
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int totalCells=n*m;
        for(int i=0;i<totalCells;i++){
            int cells[]=map.get(arr[i]);
            rowCount[cells[0]]++;
            colCount[cells[1]]++;
            if(rowCount[cells[0]]==m || colCount[cells[1]]==n){
                return i;
            }
        }
        return -1;
    }
}