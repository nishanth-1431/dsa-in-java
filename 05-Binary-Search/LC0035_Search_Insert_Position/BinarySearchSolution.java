/*
    LeetCode #35 - Search Insert Position
    Difficulty : Easy
    Topic      : Binary Search, Arrays
    Status     : Accepted ✅
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

    Approach (Binary Search):
        1. Initialize low and high pointers.
        2. Find the middle element.
        3. If the target is found, return its index.
        4. If the target is greater than the middle element,
           search the right half.
        5. Otherwise, search the left half.
        6. If the target is not found, return low as the
           insertion position.

    Complexity:
        Time  : O(log n)
        Space : O(1)

    -----------------------------------------------------------
*/

class Solution {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return low;
    }
}