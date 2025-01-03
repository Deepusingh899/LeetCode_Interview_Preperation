class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long left=0;
        long right=0;
        for(int i:nums){
            right+=i;
        }
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right-=nums[i];
            if(left>=right){
                count++;
            }
        }
        return count;        
    }
}