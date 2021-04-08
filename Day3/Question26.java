
/*
 * Q26. A repdigit is a positive number composed out of the same digit. Write a
 * program that takes an integer and returns whether it's a repdigit or not.
 * 
 * Examples (66) ➞ true
 * 
 * (0) ➞ true
 * 
 * (-11) ➞ false
 * 
 * Notes The number 0 should return true (even though it's not a positive
 * number). Check the Resources tab for more info on repdigits.
 */
import java.util.*;

public class Question26 {
    public void isRepdigit(int num) {
        int rev = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev > 0 && rev == temp) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Question26 obj = new Question26();
        obj.isRepdigit(num);
    }
}
