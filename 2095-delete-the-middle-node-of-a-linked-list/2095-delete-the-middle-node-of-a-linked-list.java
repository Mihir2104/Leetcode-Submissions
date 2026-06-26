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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next == null ){
            return null;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;
        ListNode help = head;


        
       
        while(fast != null && fast.next!=null){

            slow = slow.next;
            help = help.next;
            fast= fast.next.next;

        }
        help.next = slow.next;

        return head;
        
    }
}