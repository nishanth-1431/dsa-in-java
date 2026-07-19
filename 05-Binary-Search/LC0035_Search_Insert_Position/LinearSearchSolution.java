/*
    LeetCode #35 - Search Insert Position
    Difficulty : Easy
    Topic      : Binary Search, Arrays
    Link       : https://leetcode.com/problems/search-insert-position/

    -----------------------------------------------------------

    Problem:
        Given a sorted array of distinct integers and a target value,
        return the index if the target is found.
        If not, return the index where it would be inserted
        to keep the array sorted.

    Example:
        Input  : nums = [1,3,5,6], target = 5
        Output : 2

        Input  : nums = [1,3,5,6], target = 2
        Output : 1

    -----------------------------------------------------------

    Approach (Linear Search):
        1. Traverse the array from left to right.
        2. If the current element equals the target,
           return its index.
        3. If the current element is greater than the target,
           return its index because the target should be
           inserted before it.
        4. If the loop completes, the target is greater than
           every element, so return nums.length.

    Complexity:
        Time  : O(n)
        Space : O(1)

    -----------------------------------------------------------
*/

class Solution {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }

            else if (nums[i] > target) {
                return i;
            }

        }

        return nums.length;
    }

}
class LinearSearchSolution{
    public static void main(String[] args) {
             int[] nums = {1, 3, 5, 6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 5)); // 2
        System.out.println(solution.searchInsert(nums, 2)); // 1
        System.out.println(solution.searchInsert(nums, 7)); // 4
        System.out.println(solution.searchInsert(nums, 0)); // 0

    }
}