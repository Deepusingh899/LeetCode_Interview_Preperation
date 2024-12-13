import java.util.Arrays;

class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        int[][] copy=new int[n][2];
        for(int i=0;i<n;i++){
            copy[i][0]=nums[i];
            copy[i][1]=i;
        }
        Arrays.sort(copy,(a,b) -> a[0]-b[0]);
        long res=0;
        for(int i=0;i<n;i++){
            int ele=copy[i][0];
            int index=copy[i][1];
            if(nums[index]<=0) continue;
            res+=nums[index];
            nums[index]=-nums[index];
            if(index-1>=0 && nums[index-1]>0){
                nums[index-1]=-nums[index-1];
            }
            if(index+1<n && nums[index+1]>0){
                nums[index+1]=-nums[index+1];
            }

        }
        return res;
    }
}