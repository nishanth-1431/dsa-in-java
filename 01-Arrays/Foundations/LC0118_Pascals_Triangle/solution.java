/*
    LeetCode #118 - Pascal's Triangle
    Difficulty : Easy
    Topic      : Arrays
    Link       : https://leetcode.com/problems/pascals-triangle/

    -----------------------------------------------------------

    Problem:
        Given an integer numRows, return the first numRows
        of Pascal's Triangle.

    Example:
        Input  : numRows = 5
        Output :
            [
                [1],
                [1,1],
                [1,2,1],
                [1,3,3,1],
                [1,4,6,4,1]
            ]

    -----------------------------------------------------------

    Approach:
        1. Create a list to store all rows of the triangle.
        2. Create each row one by one.
        3. Every row starts with 1.
        4. For rows after the first two, calculate the
           middle elements using the previous row.
        5. Every row ends with 1.
        6. Add the completed row to the triangle.
        7. Return the triangle.

    Key Idea:
        Each middle element is the sum of the two adjacent
        elements from the previous row.

    Complexity:
        Time  : O(n²)
        Space : O(n²)

    -----------------------------------------------------------
*/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // First element
            row.add(1);
            // Middle elements
            if (i > 1) {
                List<Integer> previous = triangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(previous.get(j - 1) + previous.get(j));
                }
            }
            // Last element
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}