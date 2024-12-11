class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if(nums.length==1) return 1;

        //find the max value from the nums array
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        //create a countArray
        int[] count=new int[max+1];
        //insert the valsue in the count array
        for(int num:nums){
            count[Math.max(num-k,0)]++;
            count[Math.min(num+k+1,max)]--;
        }

        //iterate the count array to count the prefix value
        int currSum=0;
        int maxSum=0;
        for(int cou:count){
            currSum+=cou;
            maxSum=Math.max(maxSum,currSum);
        }

        return maxSum;        
    }
}