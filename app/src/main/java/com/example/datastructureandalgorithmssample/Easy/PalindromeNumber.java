package com.example.datastructureandalgorithmssample.Easy;

public class PalindromeNumber {

    /*Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Constraints:
    -231 <= x <= 231 - 1

    Follow up: Could you solve it without converting the integer to a string?*/

    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int reversedNumber = 0, remainder;
        int originalNumber = x;
        while(x != 0) {
            remainder = x % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            x /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
