package com.linjh.dome240710;

import java.util.HashSet;

public class test1 {
//    1、2

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        HashSet<Integer> objects = new HashSet<>();
        ListNode right = head.next;
        ListNode left = head;
        objects.add(left.val);

        while (right != null) {
            if (!objects.contains(right.val)) {
                objects.add(right.val);
                right = right.next;
                left = left.next;
            } else {
                left.next = right.next;
                right = left.next;
            }
        }
        return head;
    }

}
