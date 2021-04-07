
/*
 * Q6. Take input, an array of positive and negative numbers. Return an array
 * where the first element is the count of positive numbers and the second
 * element is the sum of negative numbers.
 * 
 * Examples [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15] ➞ [10, -65]
 * // There are a total of 10 positive numbers. // The sum of all negative
 * numbers equals -65.
 * 
 * [92, 6, 73, -77, 81, -90, 99, 8, -85, 34] ➞ [7, -252]
 * 
 * [91, -4, 80, -73, -28] ➞ [2, -105]
 * 
 * [] ➞ []
 * 
 * Notes If given an empty array, return an empty array: [] 0 is not positive.
 */
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("The elements are: ");
        for (int j = 0; j < n; j++) {
            int i = sc.nextInt();
            a1.add(i);
        }
        if (a1.isEmpty()) {
            System.out.println(a1);
        } else {
            int pos = 0, neg = 0;
            Iterator i1 = a1.iterator();
            while (i1.hasNext()) {
                Integer i2 = (Integer) i1.next();
                if (i2 > 0) {
                    pos++;
                } else {
                    neg += i2;
                }
            }
            a2.add(pos);
            a2.add(neg);
            System.out.println(a2);
        }

    }
}
