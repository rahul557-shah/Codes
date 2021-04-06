
/*
 * Q6. In mathematics, an Arithmetic Progression (AP) is a sequence of numbers
 * such that the difference between the consecutive terms is constant. Write a
 * program that takes three arguments: The first element of the sequence, first
 * Constant difference between the elements, diff Total numbers in the sequence,
 * n
 * 
 * Return the first n elements of the sequence with the given common difference
 * diff. Final result should be a string of numbers, separated by comma and
 * space. Examples first=1, diff=2, n=5 ➞ "1, 3, 5, 7, 9" first=1, diff=0, n=5 ➞
 * "1, 1, 1, 1, 1" first=1, diff=-3,n=10 ➞
 * "1, -2, -5, -8, -11, -14, -17, -20, -23, -26"
 */
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the number of occurances: ");
        int n = sc.nextInt();
        System.out.println("Enter the difference: ");
        int d = sc.nextInt();
        System.out.print("\"" + first + ", ");
        for (int i = 2; i <= n; i++) {
            first += d;
            String s = Integer.toString(first);
            if (i == n) {
                System.out.print(s);
            } else {
                System.out.print(s + ", ");
            }
        }
        System.out.println("\"");
    }
}
