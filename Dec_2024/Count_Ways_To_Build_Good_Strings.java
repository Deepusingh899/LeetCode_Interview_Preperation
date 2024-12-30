class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int maxLen=high+Math.max(zero,one);
        int dp[]=new int[maxLen+1];
        for(int len=high;len>=0;len--){
            int zeroLen=len+zero;
            int onesLen=len+one;
            int zerosCount=(zeroLen>=low && zeroLen<=high)?1:0;
            int onesCount=(onesLen>=low && onesLen<=high)?1:0;
            int res=zerosCount+dp[zeroLen]+ onesCount+dp[onesLen];
            dp[len]=res %(1000000007);
        }
        return dp[0];
        
    }
}