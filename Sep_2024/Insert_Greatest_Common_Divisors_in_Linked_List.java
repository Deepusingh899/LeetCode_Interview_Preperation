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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode curr=head;
        while(curr.next!=null){
            int gcd=findGCD(curr.val,curr.next.val);
            ListNode gcdNode=new ListNode(gcd);
            gcdNode.next=curr.next;
            curr.next=gcdNode;
            curr=gcdNode.next;
        }
       return head; 
    }

    public int findGCD(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        // int gcd=1;
        // for(int i=1;i<=a && i<=b;i++){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //     }
        // }
        // if(b==0){
        //     return a;
        // }
        // return findGCD(b,a%b);
        return b;
    }
}