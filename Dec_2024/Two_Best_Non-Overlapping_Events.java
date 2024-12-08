class Solution {
    public int maxTwoEvents(int[][] events) {
        // sort from the end
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[1]-b[1]);

        //sor from the start
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int prevMax=0;
        int ans=0;
        //2*NlogN
        // O(N) in space complexity
        for(int event[]: events){
           
            while(!pq.isEmpty() && pq.peek()[1]<event[0]){
                prevMax=Math.max(prevMax,pq.peek()[2]);
                pq.poll();
            }
            ans=Math.max(ans,prevMax+event[2]);
            pq.offer(event);
        }

       return ans; 
    }
}