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
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle of linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half of list
        ListNode secondHalfStart = reverseList(slow.next);

        // Step 3: Compare first half and reversed second half
        ListNode firstHalfStart = head;
        ListNode secondHalfIter = secondHalfStart;
        boolean isPalindrome = true;

        while (isPalindrome && secondHalfIter != null) {
            if (firstHalfStart.val != secondHalfIter.val) {
                isPalindrome = false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // Optional: Restore the list to original
        slow.next = reverseList(secondHalfStart);

        return isPalindrome;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
        

    }
}