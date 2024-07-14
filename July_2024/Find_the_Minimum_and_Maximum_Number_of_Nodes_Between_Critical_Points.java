/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prevNode=head;
        ListNode currNode=head;
        ListNode nextNode=head.next;
        int count=1;
        int firstIndex=-1;
        int lastIndex=-1;
        int leastDistance=Integer.MAX_VALUE;

        while(currNode.next!=null){
            if((currNode.val<prevNode.val && currNode.val<nextNode.val) || currNode.val>prevNode.val && currNode.val>nextNode.val){
                if(firstIndex==-1){
                    firstIndex=count;
                }else{
                    leastDistance=Math.min(leastDistance,count-lastIndex);
                }
                lastIndex=count;
            }
            prevNode=currNode;
            currNode=nextNode;
            nextNode=currNode.next;
            count++;
        }
        if(firstIndex==-1 || lastIndex==firstIndex){
            return new int[]{-1,-1};
        }
        return new int[] {leastDistance,lastIndex-firstIndex};
        
    }
}