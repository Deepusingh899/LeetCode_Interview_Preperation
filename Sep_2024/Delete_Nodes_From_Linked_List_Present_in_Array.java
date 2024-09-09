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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        boolean[] freq=new boolean[(int)1e5+1];
        // System.out.println(max);
        for(int i : nums){
            freq[i]=true;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            if(freq[curr.val]==true){
                if(prev==null){
                    head=curr.next;
                    curr.next=null;
                    curr=head;
                }else{
                    prev.next=curr.next;
                    curr.next=null;
                    curr=prev.next;
                    
                }
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        // head=temp.next;
        return head;
        
    }
}