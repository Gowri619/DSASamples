package com.example.datastructureandalgorithmssample.Easy;

import static com.example.datastructureandalgorithmssample.Easy.MiddleOfLinkedList.printNodeValues;

import com.example.datastructureandalgorithmssample.ListNode;

public class MergeTwoSortedLists {

    /*You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.

    Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    Example 2:
    Input: list1 = [], list2 = []
    Output: []

    Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]

    Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.*/

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(list1, list2);
        printNodeValues(result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode headNode = new ListNode(0);

        ListNode temp = headNode;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null) {

            if(temp1.val < temp2.val) {

                temp.next = temp1;

                temp1 = temp1.next;

            } else {

                temp.next = temp2;

                temp2 = temp2.next;

            }
            temp = temp.next;
        }

        if(temp1 != null) {
            temp.next = temp1;
        }

        if(temp2 != null) {
            temp.next = temp2;
        }

        return headNode.next;
    }
}
