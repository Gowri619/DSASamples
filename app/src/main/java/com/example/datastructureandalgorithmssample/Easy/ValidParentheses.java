package com.example.datastructureandalgorithmssample.Easy;

import java.util.Stack;

public class ValidParentheses {

    /*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.*/

    public static void main(String[] args) {
        boolean result = isValid("()[]{}");
        System.out.println(result);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char currentChar : s.toCharArray()) {

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {

                stack.push(currentChar);

            } else {

                if (stack.isEmpty()) {

                    return false;

                } else {

                    char topChar = (Character) stack.peek();

                    if ((currentChar == ')' && topChar == '(') ||
                            (currentChar == ']' && topChar == '[') ||
                            (currentChar == '}' && topChar == '{')) {
                        stack.pop();
                    } else {

                        return false;

                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
