/*Q3. Count the number of 1s in a given 2D array.

  Examples
    [
      [1, 0],
      [0, 0]
    ] ➞ 1

    [
      [1, 1, 1],
      [0, 0, 1],
      [1, 1, 1]
    ] ➞ 7

    [
      [1, 2, 3],
      [0, 2, 1],
      [5, 7, 33]
    ] ➞ 2
*/

import java.util.*;

public class Question3 {
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
                if (a[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println("Number of ones is: " + sum);
    }
}
