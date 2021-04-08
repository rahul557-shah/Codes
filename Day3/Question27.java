
/*
 * Write a program that takes two numbers as arguments (num, length) and returns
 * an array of multiples of num until the array length reaches length.
 * 
 * Examples arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
 * 
 * arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
 * 
 * arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
 * 
 * Notes Notice that num is also included in the returned array.
 */
import java.util.*;

public class Question27 {
    public void arrayOfMultiple(int num, int len) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            a1.add(num * i);
        }
        System.out.println(a1);
    }

    public static void main(String[] args) {
        Question27 obj = new Question27();
        System.out.println("Enter the number and size");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len = sc.nextInt();
        obj.arrayOfMultiple(num, len);
    }
}
