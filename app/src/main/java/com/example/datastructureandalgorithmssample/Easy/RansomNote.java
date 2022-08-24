package com.example.datastructureandalgorithmssample.Easy;

public class RansomNote {

    /*Given two strings "ransomNote" and "magazine", return true if "ransomNote" can be constructed by using the letters from
    magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.
    Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false

    Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false

    Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true

    Constraints:
    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.*/

    public static void main(String[] args) {
        boolean result = canConstruct("a", "b");
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < magazine.length(); i++) {
            for (int j = 0; j < ransomNote.length(); j++) {
                if (magazine.charAt(i) == ransomNote.charAt(j)) {
                    ransomNote = ransomNote.replaceFirst(String.valueOf(ransomNote.charAt(j)), "");
                    break;
                }
            }
        }
        return ransomNote.isEmpty();
    }
}
