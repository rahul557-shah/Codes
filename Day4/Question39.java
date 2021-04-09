/*
 * Q39 Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum. Examples:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has
 * the largest sum = 6. Input: nums = [1] Output: 1 Input: nums = [5,4,-1,7,8]
 * Output: 23
 */

import java.util.*;

public class Question39 {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int tobemax = 0, max = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tobemax = tobemax + a[i];
            if (tobemax < 0) {
                tobemax = 0;
            }
            if (max < tobemax) {
                max = tobemax;
            }
        }
        System.out.println("Max Sum is: " + max);
    }
}
