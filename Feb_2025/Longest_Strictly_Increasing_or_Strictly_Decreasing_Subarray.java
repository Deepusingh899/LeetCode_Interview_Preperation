class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=1;
        int increasing=1;
        int decreasing=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                increasing++;
                decreasing=1;
            }else if(nums[i]>nums[i+1]){
                increasing=1;
                decreasing++;
            }else{
                increasing=1;
                decreasing=1;
            }
            max=Math.max(max,Math.max(increasing,decreasing));
        }
        return max;        
    }
}