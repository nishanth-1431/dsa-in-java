/*
    LeetCode #125 - Valid Palindrome
    Difficulty : Easy
    Topic      : Two Pointers, String
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/valid-palindrome/

    -----------------------------------------------------------

    Problem:
        Given a string, determine whether it is a palindrome,
        considering only alphanumeric characters and ignoring cases.

    Example:
        Input  : "A man, a plan, a canal: Panama"
        Output : true

        Input  : "race a car"
        Output : false

    -----------------------------------------------------------

    Approach (Brute Force):
        1. Traverse the string and keep only letters and digits.
        2. Convert all characters to lowercase.
        3. Reverse the cleaned string.
        4. Compare the cleaned string with the reversed string.
        5. Return true if both are equal; otherwise return false.

    Complexity:
        Time  : O(n)
        Space : O(n)

    -----------------------------------------------------------
*/

class Solution {
    public boolean isPalindrome(String s) {
        String rev = "";
        String cleaned="";
        for(int i = 0;i<s.length() ; i++){
            char ch = s.charAt(i);  
            if(Character.isLetterOrDigit(ch)){
                cleaned += Character.toLowerCase(ch);
            }
        }
        for(int i = cleaned.length()-1;i>=0;i--){
            rev += cleaned.charAt(i);
        }
        return cleaned.equals(rev);
    }
}
