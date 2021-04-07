/*Q9.  Write a program that takes an array of numbers arr and a number n. Return true if the sum of any two elements is equal to the given number. Otherwise, return false.

  Examples
    ([10, 12, 4, 7, 9, 11], 16) ➞ true

    ([4, 5, 6, 7, 8, 9], 13) ➞ true

    ([0, 98, 76, 23], 174) ➞ true

    ([0, 9, 7, 23, 19, 18, 17, 66], 39) ➞ false

    ([2, 8, 9, 12, 45, 78], 1) ➞ false */

import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("The elements are: ");
        for (int j = 0; j < n; j++) {
            int i = sc.nextInt();
            a1.add(i);
        }
        Collections.sort(a1);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("(" + a1 + "," + num + ")");
        int first = 0;
        int last = n - 1;
        while (first < last) {
            if (a1.get(first) + a1.get(last) == num) {
                System.out.println("true");
                break;
            } else if (a1.get(first) + a1.get(last) < num) {
                first++;
            } else {
                last--;
            }
            System.out.println("false");
            break;
        }
    }
}
