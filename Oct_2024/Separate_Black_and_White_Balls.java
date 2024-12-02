class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long swapCount=0;
        int last=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                swapCount+=i-last;
                last++;
            }
        } 
        return swapCount;       
    }
}