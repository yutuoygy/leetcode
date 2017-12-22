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
        }
        return Msort(lists, 0, lists.size() - 1);
    }

    public ListNode Msort(ArrayList<ListNode> lists, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ListNode leftList = Msort(lists, low, mid);
            ListNode rightList = Msort(lists, mid + 1, high );
            return mergeTwoLists(leftList, rightList);
        }
        return lists.get(low);
    }
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
