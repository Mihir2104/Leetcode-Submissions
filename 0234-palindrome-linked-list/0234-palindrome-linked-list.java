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
    public boolean isPalindrome(ListNode head) {
        

        ListNode middle = findMiddle(head);
        ListNode rHead = reverseLL(middle);
        ListNode ptr = head;

        while(ptr != null && rHead != null){
            if(ptr.val != rHead.val ){
                return false;
            }
            ptr=ptr.next;
            rHead=rHead.next;
        }
        return true;
        
    }

    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseLL(ListNode head){
        ListNode t1 = null;
        ListNode t2 = head;
        ListNode t3;

        while(t2!=null){
            t3 = t2.next;
            t2.next = t1;
            t1=t2;
            t2=t3;
        }
        head = t1;
        return head;
    }
}