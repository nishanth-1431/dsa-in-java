/*
    LeetCode #242 - Valid Anagram
    Difficulty : Easy
    Topic      : String, Sorting
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/valid-anagram/

    -----------------------------------------------------------

    Problem:
        Given two strings s and t, return true if t is an
        anagram of s, and false otherwise.

        An anagram is a word formed by rearranging the letters
        of another word using all the original letters exactly once.

    Example:
        Input  : s = "anagram", t = "nagaram"
        Output : true

        Input  : s = "rat", t = "car"
        Output : false

    -----------------------------------------------------------

    Approach (Sorting):
        1. Check if both strings have the same length.
        2. Convert both strings into character arrays.
        3. Sort both arrays.
        4. Compare the sorted arrays.
        5. If both arrays are equal, return true;
           otherwise return false.

    Complexity:
        Time  : O(n log n)
        Space : O(n)

    -----------------------------------------------------------
*/

import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}