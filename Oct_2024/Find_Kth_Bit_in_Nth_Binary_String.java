class Solution {
    public char findKthBit(int n, int k) {
        int len=(int)Math.pow(2,n)-1;
        return recur(len,k);        
    }
    public char recur(int len,int k){
        if(len==1) return '0';
        int half=len/2;
        int middle=half+1;
        if(middle==k) return '1';
        else if(k<middle){
            return recur(half,k);
        }else{
            char ch=recur(half,len-k+1);
            return (ch=='0') ? '1':'0';
        }
    }
}
