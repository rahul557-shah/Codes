
/*
 * Q8. Given an array A of integers, we must modify the array in the following
 * way: we choose an i and replace A[i] with -A[i], and we repeat this process K
 * times in total. (We may choose the same index i multiple times.) Return the
 * largest possible sum of the array after modifying it in this way.
 * 
 * Example 1: Input: A = [4,2,3], K = 1 Output: 5 Explanation: Choose indices
 * (1,) and A becomes [4,-2,3]. Example 2: Input: A = [3,-1,0,2], K = 3 Output:
 * 6 Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2]. Example 3:
 * Input: A = [2,-3,-1,5,-4], K = 2 Output: 13 Explanation: Choose indices (1,
 * 4) and A becomes [2,3,-1,5,4].
 */
import java.util.*;

public class Question8 {
    public int largestSum(int[] a, int k) {

        Arrays.sort(a);

        int sum = 0;
        int mayBeMinPositive = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (k > 0) {
                    sum += -a[i];
                    k--;
                    mayBeMinPositive = Math.min(mayBeMinPositive, -a[i]);
                } else {
                    sum += a[i];
                }
            } else if (a[i] == 0) {
                k = 0;
            } else if (a[i] > 0) {
                if (k > 0) {
                    sum += a[i];
                    if (mayBeMinPositive < a[i]) {
                        sum = calculate(sum, mayBeMinPositive, k);
                    } else {
                        sum = calculate(sum, a[i], k);
                    }
                    k = 0;
                } else {
                    sum += a[i];
                }
            }
        }
        return sum;
    }

    private int calculate(int sum, int number, int k) {
        if (k % 2 == 0) {
            return sum;
        } else {
            return sum - 2 * number;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of  array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the values of k: ");
        int k = sc.nextInt();
        Question8 obj = new Question8();
       System.out.println( obj.largestSum(a, k));
    }
}

