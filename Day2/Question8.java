
/*
 * Q8. Write a program that finds each factor of a given number n. Your solution
 * should return an array of the number(s) that meet this criteria.
 * 
 * Examples (9) ➞ [1, 3, 9] // 9 has three factors 1, 3 and 9
 * 
 * (12) ➞ [1, 2, 3, 4, 6, 12]
 * 
 * (20) ➞ [1, 2, 4, 5, 10, 20]
 * 
 * (0) ➞ []
 */
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = 1;
        int n = sc.nextInt();
        while (i <= n) {
            if (n % i == 0) {
                a1.add(i);
            }
            i++;
        }
        System.out.print(a1);
    }
}
