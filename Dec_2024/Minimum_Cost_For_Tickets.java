import java.util.HashSet;

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> set=new HashSet<>();
        for(int day: days){
            set.add(day);
        }
        int lastDays=days[days.length-1]+30;
        int dp[]=new int[lastDays+1];
         for(int day=days[days.length-1];day>=0;day--){
            if(!set.contains(day)){
                dp[day]=dp[day+1];
                continue;
            }
            int oneDay=costs[0]+dp[day+1];
            int sevenDay=costs[1]+dp[day+7];
            int thirtyDay=costs[2]+dp[day+30];
            dp[day]=Math.min(oneDay,Math.min(sevenDay,thirtyDay));
         }
         return dp[days[0]];       
    }
}