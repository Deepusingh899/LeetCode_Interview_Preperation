class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int res=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') count++;
        }
        res=count;
        for(int i=1;i<n-k+1;i++){
            if(blocks.charAt(i-1)=='W') count--;
            if(blocks.charAt(i+k-1)=='W') count++;
            res=Math.min(res,count);
        }
        return res;
        
    }
}