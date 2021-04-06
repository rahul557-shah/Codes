/*
  Q3. Given an array of integers, determine whether the sum of its elements is
  even or odd. The output should be a string ("odd" or "even"). If the input
  array is empty, consider it as an array with a zero ([0]). Examples
  evenOrOdd([0]) ➞ "even" evenOrOdd([1]) ➞ "odd" evenOrOdd([]) ➞ "even"
  evenOrOdd([0, 1, 5]) ➞ "even"
 */

import java.util.*;

public class Question3 {
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
        int sum = 0;
        Iterator i1 = a1.iterator();
        while (i1.hasNext()) {
            Integer i2 = (Integer) i1.next();
            sum += i2;
        }
        System.out.println("The sum is: " + sum);
        if (sum % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
