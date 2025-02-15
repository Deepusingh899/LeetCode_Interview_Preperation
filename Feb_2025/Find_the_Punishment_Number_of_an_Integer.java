import java.util.Arrays;

class Solution {
    public int punishmentNumber(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            String i2= Integer.toString(i*i);
            int len=i2.length();
            int[][] dp=new int[len][i+1];
            for(int k=0;k<dp.length;k++){
                Arrays.fill(dp[k],-1);
            }
            if(isPartition(0,i2,i,0,dp)){
                count+=Integer.parseInt(i2);
            }
        }
        return count;
        
    }
    public boolean isPartition(int j,String i2,int i,int currSum,int[][] dp){
        int n=i2.length();
        if(n==j){
            return (currSum==i);
        }
        if(currSum>i){
            return false;
        }
        if(dp[j][currSum]!=-1){
            return (dp[j][currSum]==1);
        }
        for(int k=j;k<n;k++){
            int value=Integer.parseInt(i2.substring(j,k+1));
            if(isPartition(k+1,i2,i,currSum+value,dp)){
                dp[j][currSum]=1;
                return true;
            }
        }
        dp[j][currSum]=0;
        return false;
    }
}