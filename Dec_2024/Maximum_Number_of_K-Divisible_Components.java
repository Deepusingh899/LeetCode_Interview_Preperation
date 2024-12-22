import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adjList=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjList[i]=new ArrayList<>();
        }
        for(int []edge:edges){
            int node1=edge[0];
            int node2=edge[1];
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }
        int[] countComponents=new int[1];
        dfs(0,-1,adjList,values,k,countComponents);
        return countComponents[0];
    }
    public long dfs(int currentNode,int parent,List<Integer>[] adjList,int[] values,int k,int[] countComponents){
        long sum=0;
        for(int neighbours: adjList[currentNode]){
            if(neighbours!=parent){
                sum+=dfs(neighbours,currentNode,adjList,values,k,countComponents);
            }
        }
        sum+=values[currentNode];
        if(sum%k==0){
            countComponents[0]++;
            sum=0;
        }
        return sum;
    }
}