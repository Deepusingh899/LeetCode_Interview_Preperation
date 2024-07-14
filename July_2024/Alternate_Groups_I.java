class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        for(int i=0;i<colors.length;i++){
            int current=colors[i];
            int next1=colors[(i+1)%colors.length];
            int next2=colors[(i+2)%colors.length];
            if((current!=next1) && (next1!=next2)){
                count++;
            }
        }
        return count;
    }
}