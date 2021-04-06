
/*
 * Q5. Given an array of either entirely odd integers or entirely even integers
 * except for a single Outlier Number. Write a program to return this number.
 * Examples [2, 3, 4] ➞ 3 // 2 and 4 are even numbers. // 3 is an outlier
 * number. [1, 2, 3] ➞ 2 [4, 1, 3, 5, 9] ➞ 4
 */
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("The elements are: ");
        for (int j = 0; j < n; j++) {
            int i = sc.nextInt();
            a1.add(i);
        }
        Iterator i1 = a1.iterator();
        while (i1.hasNext()) {
            Integer i2 = (Integer) i1.next();
            if (i2 % 2 == 0) {
                even.add(i2);
            } else {
                odd.add(i2);
            }
        }
        if (even.size() > odd.size()) {
            System.out.println("The Outliner number is: " + odd.get(0));
            System.out.println("The even numbers are: " + even);
        } else {
            System.out.println("The Outlier number is: " + even.get(0));
            System.out.println("The odd numbers are: " + odd);
        }
    }
}