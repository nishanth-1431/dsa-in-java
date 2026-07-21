/*
    LeetCode 217. Contains Duplicate
    Difficulty : Easy
    Topic      : Arrays, Hash Table
    Link       : https://leetcode.com/problems/contains-duplicate/

    -----------------------------------------------------------

    Problem:
        Given an integer array nums, return true if any value
        appears at least twice in the array, and return false
        if every element is distinct.

    Example 1:
        Input : nums = [1,2,3,1]
        Output: true

    Example 2:
        Input : nums = [1,2,3,4]
        Output: false

    Example 3:
        Input : nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true

    -----------------------------------------------------------

    Approach:
        1. Traverse the array using the first loop.
        2. For each element, compare it with every remaining
           element using a second loop.
        3. If two elements are equal, return true.
        4. If no duplicate is found after checking all pairs,
           return false.

    Complexity:
        Time  : O(n^2)
        Space : O(1)

    Notes:
        - Brute Force Solution
        - Uses nested loops to compare every pair.
        - Can be optimized to O(n) using a HashSet.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
class BruteForce {

}