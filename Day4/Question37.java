
/*
 * Q37. Given an integer num, return an array of the number of 1's in the binary
 * representation of every number in the range [0, num]. Examples: Input: num =
 * 2 Output: [0,1,1] Explanation: 0 --> 0 1 --> 1 2 --> 10 Input: num = 5
 * Output: [0,1,1,2,1,2] Explanation: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 -->
 * 100 5 --> 101
 */

import java.util.*;

public class Question37 {
    public int binary(int n) {
        ArrayList<Integer> a1 = new ArrayList<>();
        int rem, no_of_one = 0;
        while (n != 0) {
            rem = n % 2;
            a1.add(rem);
            n = n / 2;
        }
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i) == 1) {
                no_of_one++;
            }
        }
        return no_of_one;
    }

    public ArrayList<Integer> list(int num) {
        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            a2.add(binary(i));
        }
        return a2;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question37 obj = new Question37();
        System.out.println(obj.list(n));
    }
}
