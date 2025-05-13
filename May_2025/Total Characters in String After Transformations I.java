class Solution {
    public int lengthAfterTransformations(String s, int t) {
        // String str="";
        int MOD=1000000007;
        int[] count=new int[26];
        int z=25;
        int res=s.length();
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        while(t>0){
            res=(res+count[z])%MOD;
            count[(z+1)%26]=(int)((count[(z+1)%26] + (long) count[z])%MOD);
            z=(z+25)%26;
            t--;
        }
        return res;
    }
}