
/*
 * Q5. Take an input, array of numbers and return only the even values.
 * 
 * Examples [1, 2, 3, 4, 5, 6, 7, 8] ➞ [2, 4, 6, 8]
 * 
 * [43, 65, 23, 89, 53, 9, 6] ➞ [6]
 * 
 * [718, 991, 449, 644, 380, 440] ➞ [718, 644, 380, 440]
 * 
 * Notes Return all even numbers in the order they were given. All test cases
 * contain valid numbers ranging from 1 to 3000.
 */
import java.util.*;

public class Question5 {
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
        while (i1.hasNext()) {
            Integer i2 = (Integer) i1.next();
            if (i2 % 2 != 0) {
                i1.remove();
            }
        }
        System.out.println(a1);
    }
}
