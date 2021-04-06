/*
Q7. Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
Return the length of the longest (contiguous) subarray that contains only 1s. 
 
Example 1:
Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
Example 2:
Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation: 
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
*/

import java.util.*;

class Question7 {
    public static int countConsecutiveOnes(int a[], int k) {
        int maxConsecutiveOne = 0;
        int start = 0;
        int zeroCount = 0;
        for (int end = 0; end < a.length; end++) {
            if (a[end] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (a[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            maxConsecutiveOne = Math.max(maxConsecutiveOne, end - start + 1);
        }
        return maxConsecutiveOne;
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(countConsecutiveOnes(a, k));
    }
}
