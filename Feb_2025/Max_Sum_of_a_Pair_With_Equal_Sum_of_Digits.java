class Solution {
    public int getDigitSum(int nums){
        int sum=0;
        while(nums>0){
            sum+=nums%10;
            nums/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        int map[] =new int[82];
        int ans=-1;
        for(int num:nums){
            int digitSum=getDigitSum(num);
            // if(map.containsKey(digitSum)){
            if(map[digitSum]>0){
                // int prevNum=map.get(digitSum);
                int prevNum=map[digitSum];
                ans=Math.max(num+prevNum,ans);
                // map.put(digitSum,Math.max(prevNum,num));
                map[digitSum]=Math.max(prevNum,num);
            }else{
                map[digitSum]=num;
            }
        }

        return ans;        
    }
}