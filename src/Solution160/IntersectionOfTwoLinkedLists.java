package Solution160;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode Ahead = headA;
        ListNode Bhead = headB;

        while (Ahead != Bhead) {
            Ahead = Ahead == null ? headB : Ahead.next;
            Bhead = Bhead == null ? headA : Bhead.next;
        }

        return Ahead;
    }

}
