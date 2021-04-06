/*
  Q4. Add 1 to every element in the given array. Examples [0, 1, 2, 3] ➞ [1, 2,
  3, 4] [2, 4, 6, 8] ➞ [3, 5, 7, 9] [-1, -2, -3, -4] ➞ [0, -1, -2, -3]
 */

import java.util.*;

public class Question4 {
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
        System.out.println(a1);
        Iterator i1 = a1.iterator();
        for (int j = 0; j < n; j++) {
            Integer i2 = (Integer) i1.next() + 1;
            a1.set(j, i2);
        }
        System.out.println(a1);
    }
}
