/*
    LeetCode #66 - Plus One
    Difficulty : Easy
    Topic      : Arrays
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/plus-one/

    -----------------------------------------------------------

    Problem:
        You are given a large integer represented as an integer
        array digits, where each digit represents a single digit.
        Increment the integer by one and return the resulting array.

    Example:
        Input  : digits = [1,2,3]
        Output : [1,2,4]

        Input  : digits = [4,3,2,1]
        Output : [4,3,2,2]

        Input  : digits = [9,9,9]
        Output : [1,0,0,0]

    -----------------------------------------------------------

    Approach (Optimal):
        1. Traverse the array from the last digit.
        2. If the current digit is not 9, increment it by one
           and return the array.
        3. If the current digit is 9, change it to 0 and
           continue to the previous digit.
        4. If every digit is 9, create a new array with one
           extra element, set the first element to 1,
           and return the new array.

    Complexity:
        Time  : O(n)
        Space : O(1)

    -----------------------------------------------------------
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
                continue;
            }
        }
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
    }
}