class Solution {
    public void dfs(int src,List<List<Integer>> list,boolean[] visited){
        visited[src]=true;
        for(int neighbour: list.get(src)){
            if(!visited[neighbour])
            dfs(neighbour,list,visited);
        }
    }
    public int removeStones(int[][] stones) {
        int n=stones.length;
        int count=0;
        boolean visited[]=new boolean[n];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        // for(int i=0) 
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,list,visited);
                count++;
            }
        }
        return n-count;       
    }
}