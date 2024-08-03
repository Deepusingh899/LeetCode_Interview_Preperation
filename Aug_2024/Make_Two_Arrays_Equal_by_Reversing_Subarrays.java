class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int m=target.length;
        int  n=arr.length;
        if(m!=n) return false;
        int []freqArr=new int [1001];
        for(int i=0;i<m;i++){
            freqArr[target[i]]++;
            freqArr[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            if(freqArr[target[i]]!=0 && freqArr[arr[i]]!=0){
                return false;
            }
        }
        return true;       
    }
}