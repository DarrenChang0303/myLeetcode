package Solution83;

public class RemoveDuplicatesFromSortedList {
    // Solution 83
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode a = deleteDuplicates(head.next);
            if (head.val == a.val) {
                head.next = a.next;
            }
            return head;
        }
    }
}