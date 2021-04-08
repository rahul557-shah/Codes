
/*
 * Q24. Suppose an image can be represented as a 2D array of 0s and 1s. Write a
 * function to reverse an image. Replace the 0s with 1s and vice versa.
 * 
 * Examples ([ [1, 0, 0], [0, 1, 0], [0, 0, 1] ]) ➞ [ [0, 1, 1], [1, 0, 1], [1,
 * 1, 0] ]
 * 
 * ([ [1, 1, 1], [0, 0, 0] ]) ➞ [ [0, 0, 0], [1, 1, 1] ]
 * 
 * ([ [1, 0, 0], [1, 0, 0] ]) ➞ [ [0, 1, 1], [0, 1, 1] ]
 */
import java.util.*;

public class Question24 {
    public static void reverse(int a[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

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
        reverse(a, m, n);
    }
}
