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
    public ListNode reverseList(ListNode head) {
        

        if(head == null || head.next == null)
            return head;  


        ListNode prev = null; 
        ListNode head2 = head;

        while(head2 != null){

           ListNode temp = head2.next;

           head2.next = prev;

           prev = head2;

           head2 = temp;

        }

        return prev;
    }
}
