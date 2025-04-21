class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long a=0;
        long min=0;
        long max=0;
        for(int i=0;i<differences.length;i++){
            a+=differences[i];
            min=Math.min(a,min);
            max=Math.max(a,max);
        }
        long diff1=upper-lower;
        long diff2=max-min;
        return (int) Math.max(0,(diff1-diff2)+1);
        
    }
}