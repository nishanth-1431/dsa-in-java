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
        1. Create an empty HashSet.
        2. Traverse the array using a for-each loop.
        3. If the current element already exists in the HashSet,
           return true.
        4. Otherwise, add the element to the HashSet.
        5. If the traversal completes without finding duplicates,
           return false.

    Complexity:
        Time  : O(n)
        Space : O(n)

    Notes:
        - Optimal Solution
        - Uses HashSet for fast lookup.
        - add() and contains() take O(1) average time.
        - Stops immediately when a duplicate is found.
*/

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

class HashSetSolution {

}