/*
    LeetCode 412. Fizz Buzz
    Difficulty : Easy
    Topic      : Math, Simulation
    Link       : https://leetcode.com/problems/fizz-buzz/

    -----------------------------------------------------------

    Problem:
        Given an integer n, return a string array answer
        (1-indexed) where:

        - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        - answer[i] == "Fizz" if i is divisible by 3.
        - answer[i] == "Buzz" if i is divisible by 5.
        - answer[i] == i (as a string) if none of the above
          conditions are true.

    Example 1:
        Input : n = 3
        Output: ["1","2","Fizz"]

    Example 2:
        Input : n = 5
        Output: ["1","2","Fizz","4","Buzz"]

    Example 3:
        Input : n = 15
        Output: ["1","2","Fizz","4","Buzz","Fizz",
                 "7","8","Fizz","Buzz","11","Fizz",
                 "13","14","FizzBuzz"]

    -----------------------------------------------------------

    Approach:
        1. Create an empty List of Strings.
        2. Traverse from 1 to n.
        3. If the number is divisible by both 3 and 5,
           add "FizzBuzz".
        4. Else if divisible by 3, add "Fizz".
        5. Else if divisible by 5, add "Buzz".
        6. Otherwise, convert the number to a String
           and add it to the List.
        7. Return the List.

    Complexity:
        Time  : O(n)
        Space : O(n)

    Notes:
        - Uses ArrayList to store the answer.
        - Integer.toString() converts an integer to a String.
        - Check divisibility by15 first to avoid
          missing "FizzBuzz".
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }

        return answer;
    }
}

class ArrayListSolution {

}
