class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int []pre=new int[arr.length];
        int []res=new int[queries.length];
        int j=0;
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]^arr[i];
        }
        //[1,2,6,14]
        for(int[] query:queries){
            int left=query[0];
            int right=query[1];
            if(left==0){
                res[j]=pre[right];
                j++;
            }else{
                res[j]=pre[right]^pre[left-1];
                j++;
            }
        }
        return res;
        
    }
}