package com.example.datastructureandalgorithmssample.Easy;

public class LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.*/

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int minimumLength = strs[0].length();
        for(int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength , strs[i].length());
        }

        for (int i = 0; i < minimumLength; i++) {
            char currentChar = strs[0].charAt(i);
            for(String str : strs) {
                if(str.charAt(i) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }

        return result.toString();
    }
}
