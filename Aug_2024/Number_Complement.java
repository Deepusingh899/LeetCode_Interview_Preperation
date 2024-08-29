class Solution {
    public int findComplement(int num) {
        if(num==0) return 0;

        String str=Integer.toBinaryString(num);
        int len=str.length();

        int dec=num^((1<<len)-1);
        
        return dec;    
    }
}