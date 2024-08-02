class Solution {
    public int minSwaps(int[] nums) {
        int size=0;
        for(int num: nums){
            size+=num;
        }
        int zeros=0;
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                zeros++;
            }
        }
        int minZeros=zeros;
        int start=0;
        int end=size-1;
        int n=nums.length;
        while(start<n){
            if(nums[start]==0){
                zeros--;
            }
            start++;
            end++;
            if(nums[end%n]==0){
                zeros++;
            }
            minZeros=Math.min(minZeros,zeros);
        }
        return minZeros;
    }
}