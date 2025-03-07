import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int n=heights.length;
        for(int i=0;i<n;i++){
            names[i]=map.get(heights[n-i-1]);
        }
        return names;        
    }
}