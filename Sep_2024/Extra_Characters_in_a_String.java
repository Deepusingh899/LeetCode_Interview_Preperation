class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int dp[]=new int[s.length()+1];
        HashSet<String> map=new HashSet<>(Arrays.asList(dictionary));
        dp[0]=0;
        for(int i=1;i<=s.length();i++){
            dp[i]=s.length();
        }
        for(int i=1;i<=s.length();i++){
            dp[i]=dp[i-1]+1;
            for(int j=0;j<i;j++){
                if(map.contains(s.substring(j,i))){
                    dp[i]=Math.min(dp[i],dp[j]);
                }
            }
        }
        return dp[s.length()];
        
    }
}