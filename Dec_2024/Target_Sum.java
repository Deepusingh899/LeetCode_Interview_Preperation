class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        calculateCount(nums,0,0,target);     
        return count;        
    }
    public void calculateCount(int[] nums, int i, int currSum,int target){
        if(i==nums.length){
            if(currSum==target){
                count++;
            }
        }else{
            calculateCount(nums,i+1,currSum+nums[i],target);
            calculateCount(nums,i+1,currSum-nums[i],target);
        }
    }
}