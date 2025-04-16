class Solution {
    public long countGood(int[] nums, int k) {
        long n=nums.length;
        int i=0;
        int j=0;
        long result=0;
        long pair=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            pair+=map.getOrDefault(nums[j],0);
            map.put(nums[j],map.getOrDefault(nums[j], 0) + 1);
            while(pair>=k){
                result+=n-j;
                map.put(nums[i],map.get(nums[i] )- 1);
                pair-=map.get(nums[i]);
                i++;
            }
            j++;
        }
        return result;
    }
}