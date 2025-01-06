class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] left =new int[n];
        int count=boxes.charAt(0)-'0';
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+count;
            count+=boxes.charAt(i)-'0';
        }
        count=boxes.charAt(n-1)-'0';
        int prevCount=0;
        int currCount=0;
        for(int i=n-2;i>=0;i--){
            currCount=prevCount+count;
            prevCount=currCount;
            left[i]=left[i]+currCount;
            count+=boxes.charAt(i)-'0';
        }
        return left;
    }
}