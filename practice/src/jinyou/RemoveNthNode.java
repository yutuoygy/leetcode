package jinyou;

import java.util.List;

public class RemoveNthNode {
    /*
    Given a linked list, remove the nth node from the end of list and return its head.

    For example
    Given linked list: 1->2->3->4->5, and n = 2.

    After removing the second node from the end, the linked list becomes 1->2->3->5.

     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head == null || head.next == null) {
            return null;
        }
        /*
        First of all we should consider the case if the head
        is null or not.
         */
        ListNode faster = head;
        ListNode slower = head;


        for (int i = 0; i < n; i++) {
            faster = faster.next;
        }
        /*
        先让faster指针起步往后跑n个点来确保faster和slower之间
        有n个位子的gap
         */

        if (faster == null) {
            head = head.next;
            return head;
        }
        /*
        这时候说明LikedList的长度其实小于n
         */

        while (faster.next != null) {
            slower = slower.next;
            faster = faster.next;
        }
        /*
        when the length of LinkedList is larger than n
        we need to matain the gap between the slower and
        fatser.
         */

        slower.next = slower.next.next;
        /*
        slower pointer is in the prev node that should be deleted
        that's why we need to let slower point to the slower.next.next.
         */
        return head;
    }

}
