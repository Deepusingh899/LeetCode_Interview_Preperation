class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=Integer.MIN_VALUE;
        // BruteForce with O(N^2) 
        // for(int i=0;i<values.length;i++){
        //     for(int j=i+1;j<values.length;j++){
        //         int sum=values[i]+values[j]+i-j;
        //         max=Math.max(max,sum);
        //     }
        // }

        // Optimized with O(N)
        int n=values.length;
        int leftMax=values[0]+0;
        for(int i=1;i<values.length;i++){
            int rightMax=values[i]-i;
            max=Math.max(max,leftMax+rightMax);
            leftMax=Math.max(leftMax,values[i]+i);
        }
        return max;
        
    }
}