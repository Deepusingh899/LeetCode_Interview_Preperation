import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        long gPair=0;
        long n=nums.length;
        long tPair=n*(n-1)/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i]-i;
            int prevCount=map.getOrDefault(val,0);
            gPair+=prevCount;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return tPair-gPair;        
    }
}