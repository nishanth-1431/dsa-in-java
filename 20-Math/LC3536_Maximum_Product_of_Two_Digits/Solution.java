/*
    LeetCode #3536 - Maximum Product of Two Digits
    Difficulty : Easy
    Topic      : Math
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/maximum-product-of-two-digits/

    -----------------------------------------------------------

    Problem:
        Given a positive integer n, find the maximum product
        of any two digits present in the number.

    Example:
        Input  : n = 3142
        Output : 12

        Explanation:
        Digits are 3, 1, 4, 2.
        The maximum product is 4 × 3 = 12.

    -----------------------------------------------------------

    Approach:
        1. Extract each digit using modulus (% 10).
        2. Keep track of the largest digit (l1)
           and the second largest digit (l2).
        3. Update l1 and l2 while traversing the digits.
        4. Return the product of l1 and l2.

    Complexity:
        Time  : O(d)
        Space : O(1)

    -----------------------------------------------------------
*/
class Solution {
    public int maxProduct(int n) {
        int digit;
        int l1 =0;
        int l2=0;
        while (n>0){
            digit = n % 10;
            n = n / 10;
            if(digit > l1){
                 l2 = l1;
                 l1 = digit;
            }  
            else if(digit>l2){
                l2 = digit;
            } 
        }
        return l1*l2;
    }
}