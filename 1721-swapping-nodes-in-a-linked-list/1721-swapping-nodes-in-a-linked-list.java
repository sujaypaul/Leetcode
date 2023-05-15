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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) {
        return head;
    }
    
    ListNode fast = head;
    ListNode front = head;
    while (k > 1) {
        fast = fast.next;
        front = front.next;
        k--;
    }
    
    ListNode back = head;
    while (fast.next != null) {
        back = back.next;
        fast = fast.next;
    }
    
    int val = front.val;
    front.val = back.val;
    back.val = val;
    
    return head;
    }
}