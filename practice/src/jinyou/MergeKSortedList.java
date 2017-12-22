package jinyou;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedList {
    /*
    Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {val = x;}
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0) {
            return null;
            /*
            the case when lists equals to zero.
             */
        }
        return Msort(lists, 0, lists.size() - 1);
    }

    public ListNode Msort(ArrayList<ListNode> lists, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ListNode leftList = Msort(lists, low, mid);
            ListNode rightList = Msort(lists, mid + 1, high );
            return mergeTwoLists(leftList, rightList);
            /*
            use the recursion way to seperate the arraylist into numbers of
            two linked lits, which is the base case, then use the merge two linked
            list way to solve this problem
             */
        }
        return lists.get(low);
    }
    /*
    the following part is a typically merge two sorted linkelist problem
    as I have done before.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l1;
        }
        if (l2 == null) {
            return l2;
        }
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

        if (l1 != null) {
            l3.next = l1;

        }
        if (l2 != null) {
            l3.next = l2;

        }
        return fakeHead.next;
    }

}
