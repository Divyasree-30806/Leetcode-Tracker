// Last updated: 7/9/2026, 3:11:08 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
              isCycle=true;
              break;
            
            }
            }
            if(!isCycle){
            return null;
            }
            while(head!=slow){
            slow=slow.next;
            head=head.next;
            }
            return head;
        
    }
}