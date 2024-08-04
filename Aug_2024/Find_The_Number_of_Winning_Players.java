import java.util.*;
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        
        for(int [] a: pick){
            int p=a[0];
            int c=a[1];
            map.get(p).put(c,map.get(p).getOrDefault(c,0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            boolean playersWin=false;
            for(int c: map.get(i).values()){
                if(c>i){
                    playersWin=true;
                    break;
                }
            }
            if(playersWin){
                count++;
            }
        }
        // System.out.print(map);
        return count;

        
    }
}