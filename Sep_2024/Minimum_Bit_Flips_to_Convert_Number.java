class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int count=0;
        while(xor>0){
            // System.out.println(xor);
            xor=xor&(xor-1);
            count++;
        }
        return count;
        
    }
}