class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int ptr=0;
        int group=0;
        for(int i:start){
            if(i>end[ptr]){
                ptr++;
            }else{
                group++;
            }
        }
        return group;
        
    }
}