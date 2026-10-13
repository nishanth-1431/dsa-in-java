/*
    LeetCode #283 - Move Zeroes
    Difficulty : Easy
    Topic      : Arrays, Two Pointers
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/move-zeroes/

    -----------------------------------------------------------

    Problem:
        Given an integer array nums, move all the 0's to the
        end while maintaining the relative order of the
        non-zero elements.

        The operation must be performed in-place.

    Example:
        Input  : nums = [0,1,0,3,12]
        Output : [1,3,12,0,0]

        Input  : nums = [0]
        Output : [0]

    -----------------------------------------------------------

    Approach (Optimal - Two Passes):
        1. Initialize an index variable to 0 to track the
           position for the next non-zero element.
        2. Traverse the array and place each non-zero element
           at nums[index], then increment index.
        3. Fill all remaining positions with 0.
        4. Maintain the relative order of non-zero elements
           while modifying the original array.

    Complexity:
        Time  : O(n)
        Space : O(1)

    -----------------------------------------------------------
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if( nums[i] != 0 ){
                nums[index] = nums[i];
                index++;
            }
        }
        while( index < nums.length){
            nums[index] = 0;
            index++;
        }
    }
}

public class OptimalSolution {
    
}
