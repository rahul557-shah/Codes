/*Q10 Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.

  Examples
    [1, 1, 0, 1, 3, 10, 10, 10, 10, 1] ➞ 43

    [0, 0, 0, 0, 0, 0, 0, 0, 0, 100] ➞ 100

    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] ➞ 40
  
  Notes
   You can select any 5 numbers from the given array to form maximum possible total.*/

import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        int a[] = new int[20];
        int i, j, temp, max, size;
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("Enter the elements:");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int sum = 0;
        for (i = 0; i < size / 2; i++) {
            sum += a[i];
        }
        System.out.println(+sum);
    }
}
