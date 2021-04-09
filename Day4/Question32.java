/*Q32. A set is a collection of unique items. A set can be formed from an array from removing all duplicate items.

  [1, 3, 3, 5, 5, 5]
  // original array

  [1, 3, 5]
  // original array transformed into a set
  Write a program that sorts an array and removes all duplicate items from it.

  Examples
    ([1, 3, 3, 5, 5]) ➞ [1, 3, 5]
    ([4, 4, 4, 4]) ➞ [4]
    ([5, 7, 8, 9, 10, 15]) ➞ [5, 7, 8, 9, 10, 15]
    ([3, 3, 3, 2, 1]) ➞ [1, 2, 3]

  Notes
    All arrays will have at least one element.
    For this question, output an array, not a set.*/

import java.util.*;

public class Question32 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element: ");
            int e = sc.nextInt();
            a1.add(e);
        }
        for (int i = 0; i < n; i++) {
            if (a1.contains(a1.get(i))) {
                h1.add(a1.get(i));
            }
        }
        System.out.println(a1);
        System.out.println(h1);
    }
}