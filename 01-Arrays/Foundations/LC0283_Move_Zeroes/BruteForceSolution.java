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

    Approach (Brute Force):
        1. Create a temporary array of the same size.
        2. Traverse the original array and copy all
           non-zero elements into the temporary array.
        3. The remaining positions stay as 0 since Java
           initializes integer arrays with 0.
        4. Copy the temporary array back into the
           original array.

    Complexity:
        Time  : O(n)
        Space : O(n)

    -----------------------------------------------------------
*/  
class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
                continue;
            }
            else{
                temp[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
class BruteForceSolution{
    
}