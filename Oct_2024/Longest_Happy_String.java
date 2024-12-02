class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // String str=""
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        if(a>0){
            pq.offer(new Pair(a,'a'));
        }
        if(b>0){
            pq.offer(new Pair(b,'b'));
        }
        if(c>0){
            pq.offer(new Pair(c,'c'));
        }
        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
            Pair node=pq.poll();
            int n=sb.length();
            char ch=node.ch;
            int count=node.count;
            if(n>=2 && sb.charAt(n-1)==ch && sb.charAt(n-2)==ch){
                if(pq.isEmpty()) break;
                Pair sec=pq.poll();
                sb.append(sec.ch);
                sec.count--;
                if(sec.count>0){
                    pq.offer(new Pair(sec.count,sec.ch));
                }
            }else{
                sb.append(node.ch);
                node.count--;
            }
            if(node.count>0){
                pq.offer(new Pair(node.count,node.ch));
            }
        }
        return sb.toString();
    }
}
class Pair implements Comparable<Pair>{
    int count;
    char ch;
    Pair(int count, char ch){
        this.count=count;
        this.ch=ch;
    }
    public int compareTo(Pair that){
        return that.count-this.count;
    }
}