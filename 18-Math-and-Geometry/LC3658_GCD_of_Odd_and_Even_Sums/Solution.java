/*
    LeetCode #3658 - GCD of Odd and Even Sums
    Difficulty : Easy
    Topic      : Math
    Status     : Accepted ✅
    Link       : https://leetcode.com/problems/gcd-of-odd-and-even-sums/

    -----------------------------------------------------------

    Problem:
        Given an integer n, return the GCD of:
        - the sum of the first n odd numbers, and
        - the sum of the first n even numbers.

    Example:
        Input  : n = 4
        Output : 4

    -----------------------------------------------------------

    Approach:
        1. The sum of the first n odd numbers is n².
        2. The sum of the first n even numbers is n(n + 1).
        3. gcd(n², n(n + 1))
           = n × gcd(n, n + 1)
        4. Since consecutive numbers are always coprime,
           gcd(n, n + 1) = 1.
        5. Therefore, the answer is simply n.

    Complexity:
        Time  : O(1)
        Space : O(1)

    -----------------------------------------------------------
*/

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n ;
    }
}