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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head.next == null){
            return null;
        }

        int length = calculateSize(head);

        ListNode ptr = head;

        int pos = length - n;

        if(pos == 0){
            return head.next;
        }

        while((pos - 1) > 0 && ptr.next != null){
            ptr = ptr.next;
            pos--;
        }

        // if(ptr.next == null){
        //     return null;
        // }

        ptr.next = ptr.next.next;
        return head;
        
    }

    private int calculateSize(ListNode head){
        ListNode curr = head;
        int length=0;
        while(curr!= null){
            length++;
            curr = curr.next;
        }
        return length;
    }
}