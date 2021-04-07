/*Q7. Write a program that returns the sum of all even elements in a 2D matrix.
  Examples
    [
      [1, 0, 2],
      [5, 5, 7],
      [9, 4, 3]
    ] ➞ 6
    // 2 + 4 = 6

    [
      [1, 1],
      [1, 1]
    ] ➞ 0

    [
      [42, 9],
      [16, 8]
    ] ➞ 66*/

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Enter the size of a 2D array: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter the elemnts: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(+a[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 0) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Sum of even elements is: " + sum);
    }
}
