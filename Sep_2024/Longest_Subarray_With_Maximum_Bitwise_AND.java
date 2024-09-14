class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        } 
        int count=0;
        int maxi=1;
        int i=0;
        while(i<nums.length){
            if(max==nums[i]){
                while(i<nums.length && nums[i++]==max){
                    count++;
                }
                maxi=Math.max(maxi,count);
                count=0;
            }else{
                i++;
            }
        }       
        
        return maxi;
        
    }
}