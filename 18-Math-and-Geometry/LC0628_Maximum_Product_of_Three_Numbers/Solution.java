/*
    LeetCode #628 - Maximum Product of Three Numbers
    Difficulty : Easy
    Topic      : Arrays
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/maximum-product-of-three-numbers/

    -----------------------------------------------------------

    Problem:
        Given an integer array nums, find three numbers whose
        product is maximum and return the maximum product.

    Example:
        Input  : nums = [1, 2, 3, 4]
        Output : 24

    -----------------------------------------------------------

    Approach:
        1. Traverse the array once.
        2. Keep track of the three largest numbers
           (max1, max2, max3).
        3. Keep track of the two smallest numbers
           (min1, min2), since two negative numbers
           can produce a large positive product.
        4. Return the maximum of:
              - max1 * max2 * max3
              - min1 * min2 * max1

    Complexity:
        Time  : O(n)
        Space : O(1)

    -----------------------------------------------------------
*/

class Solution {

    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Find the three largest numbers
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } 
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            } 
            else if (num > max3) {
                max3 = num;
            }

            // Find the two smallest numbers
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } 
            else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3,
                        min1 * min2 * max1);
    }

}