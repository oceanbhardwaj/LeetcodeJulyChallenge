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
    public ListNode removeElements(ListNode head, int val) {
       // if(head==null)
          //  return head;
      // ListNode prev=null;
       // ListNode next=null;
        ListNode curr=head;
        while(curr!=null && curr.val==val)
        {  curr=curr.next;
        head=curr;}
        while(curr!=null && curr.next!=null)
        { 
            
            
            if(curr.next.val==val)
            curr.next=curr.next.next;
            //curr.next.next=null;}
             else
            curr=curr.next;
            
            
            
            
        }
        return head;
        
    }
}