class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=0;
        for(int n:nums){
            r=Math.max(r,n);
        }
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,mid,maxOperations)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;        
    }
    public boolean isPossible(int[] nums,int maxBallAllowed,int maxOperation){
        int op=0;
        for(int n:nums){
            if(n>maxBallAllowed){
                int bag=(int) Math.ceil(n/(double) maxBallAllowed);
                op+=bag-1;
            }
            if(op>maxOperation){
                return false;
            }
        }
        return true;
    }
}