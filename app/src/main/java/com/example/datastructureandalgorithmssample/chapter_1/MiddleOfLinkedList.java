package com.example.datastructureandalgorithmssample.chapter_1;

import com.example.datastructureandalgorithmssample.ListNode;

public class MiddleOfLinkedList {

    /*Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.

    Example 1:
    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    Example 2:
    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

    Constraints:
    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100*/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println("BEFORE");
        printNodeValues(head);
        ListNode listNode = middleNode(head);
        System.out.println("AFTER");
        printNodeValues(listNode);
    }

    public static void printNodeValues(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ->");
            temp = temp.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        int length = getLength(head);
        ListNode temp = head;
        int middleLength = length / 2;
        while (middleLength != 0) {
            temp = temp.next;
            middleLength--;
        }
        return temp;
    }

    private static int getLength(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
