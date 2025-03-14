class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        PriorityQueue<int[]> pq= new PriorityQueue<>(
            new Comparator<int[]>(){
                public int compare(int[] x,int[] y){
                    return x[0]-y[0];
                }
            }
        );
        // ArrayList<Integer> lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            pq.offer(new int[]{arr[i],i});
        }
        int prev=Integer.MAX_VALUE;
        int rank=0;
        // int res[]=new int[n];
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            if(prev!=curr[0]){
                prev=curr[0];
                rank++;
            }
            arr[curr[1]]=rank;
        }
        return arr;        
    }
}