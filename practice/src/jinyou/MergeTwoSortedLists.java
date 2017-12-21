package jinyou;

import java.util.List;

public class MergeTwoSortedLists {
    /*
    Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing together the nodes of the first two lists.

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }
        /*
        if any of l1, l2 is null, we can just return another one as the
        sorted l3.
         */
        ListNode l3;
        if (l1.val < l2.val) {
            l3 = l1;
            l1 = l1.next;
        } else {
            l3 = l2;
            l2 = l2.next;
        }
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = l3;
        /*
        identify a new head in case that we lost the head of the l3
         */

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        /*
        when the situation that neither l1 or l2 equals to null
        then the rest of the other linkedlist is the rest of l3.
         */
        if (l1 != null) {
            l3.next = l1;
        }
        if (l2 != null) {
            l3.next = l2;
        }
        return fakeHead.next;
        /*
        drop the fake head.
         */
    }

}
