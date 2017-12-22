package jinyou;

import java.util.List;

public class SwapNodesInPairs {
    /*
    Given a linked list, swap every two adjacent nodes and return its head.
    For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
    Your algorithm should use only constant space. You may not modify the
    values in the list, only nodes itself can be changed.

     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    private ListNode swapPairs(ListNode head) {
        ListNode p = head;
        if (p == null || p.next == null) {
            return head;
        }
        /*
        the case that p is null or the node after p is null
        which means there is only one node in the list
         */
        ListNode newHead = p.next;
        /*
        we identify a new head as the second node will be head
        after reverse
         */
        p.next = p.next.next;
        newHead.next = p;
        p =newHead.next.next;
        newHead.next.next = swapPairs(p);
        /*
        we move the new hea to the third node can
        do the reverse again.
         */
        return newHead;
    }

}
