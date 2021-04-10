/*Q31 Write a program  that takes an array of arrays with numbers. Return a new (single) array with the largest numbers of each.

  Examples
    ([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]

    ([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

    ([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]*/

import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        System.out.println("Enter the elements: ");
        int arr[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        int[] result = new int[m];
        for (i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max = 0;
        }
        System.out.println("The maximum sum is: ");
        for (i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
