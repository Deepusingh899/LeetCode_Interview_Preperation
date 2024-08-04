class Solution {
    // int MOD=(int) 10e9+7;
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                lis.add(sum);
            }
        }
        Collections.sort(lis);
        int res=0;
        int MOD=1000000007;
        for(int i=left-1;i<right;i++){
            res=(res+lis.get(i))%MOD;
        }
        return res;
    }
}