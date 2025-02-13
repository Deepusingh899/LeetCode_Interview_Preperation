import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int op=0;
        for(int num:nums){
            pq.offer((long)num);
        }
        while(pq.size()>=2){
            long x=pq.poll();
            if(x>=k) break;
            long y=pq.poll();
            pq.offer(Math.min(x,y)*2+Math.max(x,y));
            op++;
        }
        return op;
    }
}