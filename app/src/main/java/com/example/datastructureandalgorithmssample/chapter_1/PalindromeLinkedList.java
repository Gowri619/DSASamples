package com.example.datastructureandalgorithmssample.chapter_1;

import android.util.Log;

import com.example.datastructureandalgorithmssample.ListNode;

public class PalindromeLinkedList {

    /*Given the head of a singly linked list, return true if it is a palindrome.

    Example 1:
    Input: head = [1,2,2,1]
    Output: true

    Example 2:
    Input: head = [1,2]
    Output: false

    Constraints:
    The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 9

    Follow up: Could you do it in O(n) time and O(1) space?*/

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
    static ListNode left;

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(5, new ListNode(1)))));
        left = head;
        boolean result = isPalindrome(head);
        System.out.println(result);
    }

    private static boolean isPalindrome(ListNode head) {
        return recursiveCheck(head);
    }

    public static boolean recursiveCheck(ListNode right) {
        //stop recursion
        if (right == null)
            return true;

        //if sub-list is not palindrome,  return false
        boolean x = recursiveCheck(right.next);
        if (!x)
            return false;

        //current left and right
        boolean y = (left.val == right.val);

        //move left to next
        left = left.next;

        return y;
    }
}
