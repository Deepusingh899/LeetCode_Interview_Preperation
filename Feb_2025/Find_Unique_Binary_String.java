class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder res=new StringBuilder("");
        char ch;
        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='0'){
                ch='1';
            }else{
                ch='0';
            }
            res.append(ch);
        }
        return res.toString();
    }
}