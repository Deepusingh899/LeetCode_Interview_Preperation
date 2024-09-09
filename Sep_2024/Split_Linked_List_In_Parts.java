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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode[] list=new ListNode[k];
        int avg=size/k;
        int extra=size%k;
        temp=head;
        for(int i=0;i<k;i++){
            if(temp==null) break;
            ListNode curr=temp;
            ListNode prev=null;
            int len=0;
            while(temp!=null && len<avg){
                prev=temp;
                temp=temp.next;
                len++;
            }
            if(extra>0){
                prev=temp;
                temp=temp.next;
                extra--;
            }
            prev.next=null;
            list[i]=curr;
        }
        return list;        
    }
}