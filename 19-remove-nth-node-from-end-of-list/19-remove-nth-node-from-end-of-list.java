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
        ListNode newHead = head;
        int counter = 1;
        while(newHead.next != null) {
            counter++;
            newHead = newHead.next;
        }
        if (counter == n) return head.next;
        newHead = head;
        for(int i = 0; i < counter - n -1; i++) {
            newHead = newHead.next;
        }
        if (newHead.next == null) return head.next;
        newHead.next = newHead.next.next;
        return head;
    }
}