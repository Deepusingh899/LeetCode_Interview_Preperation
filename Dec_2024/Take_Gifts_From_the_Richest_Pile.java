import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
        long count=0l;

        for(int gift:gifts){
            count+=gift;
            pq.offer(gift);
        }
        // long count=0    
        for(int i=0;i<k;i++){
            if(pq.isEmpty()) break;
            int largest=pq.poll();
            int sq=(int)Math.sqrt(largest);
            count-=(largest-sq);

            pq.offer(sq);
        }
        return count;
        
    }
}