import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int n=edges1.length+1;
        int m=edges2.length+1;
        List<List<Integer>> adj1=new ArrayList<>();
        List<List<Integer>> adj2=new ArrayList<>();
        for(int i=0;i<n;i++) adj1.add(new ArrayList<>());
        for(int j=0;j<m;j++) adj2.add(new ArrayList<>());

        adjMatrix(adj1,edges1);
        adjMatrix(adj2,edges2);

        int [] path1=new int[]{-1,Integer.MIN_VALUE};
        int [] path2=new int[]{-1,Integer.MIN_VALUE};
        boolean[] vis=new boolean[n];
        

        getNeighbours(path1,adj1,0,0,vis);
        Arrays.fill(vis,false);
        getNeighbours(path2,adj1,path1[0],0,vis);
        int diameter1=path2[1];

        path1=new int[]{-1,Integer.MIN_VALUE};
        path2=new int[]{-1,Integer.MIN_VALUE};
        vis=new boolean[m];
        getNeighbours(path1,adj2,0,0,vis);
        Arrays.fill(vis,false);
        getNeighbours(path2,adj2,path1[0],0,vis);
        int diameter2=path2[1];

        if(edges1.length==0) diameter1=0;
        if(edges2.length==0) diameter2=0;

        return Math.max(Math.max(diameter1,diameter2),(diameter1+1)/2+(diameter2+1)/2+1);        
    }

    public void adjMatrix(List<List<Integer>> adj,int[][] edges){
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
    }

    public void getNeighbours(int[] path,List<List<Integer>> adj,int node,int distance,boolean[] vis){
        int dis=path[1];
        vis[node]=true;
        if(distance>dis){
            path[0]=node;
            path[1]=distance;
        }
        for(int neighbours: adj.get(node)){
            if(!vis[neighbours]){
                getNeighbours(path,adj,neighbours,distance+1,vis);
            }
        }
    }
}