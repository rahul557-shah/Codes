
/*Q34. The digit distance between two numbers is the total value of the difference between each pair of digits.

  To illustrate:

    (234, 489) ➞ 12
    // Since |2 - 4| + |3 - 8| + |4 - 9| = 2 + 5 + 5
  Write a program that returns the digit distance between two integers.

  Examples
    (121, 599) ➞ 19

    (12, 12) ➞ 0

    (10, 20) ➞ 1

  Notes
    Both integers will be exactly the same length.
    All digits in num2 have to be higher than their counterparts in num1.*/
import java.util.*;

public class Question34 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter an element: ");
            int e = sc.nextInt();
            a1.add(e);
        }
        System.out.println(a1);
        int diff = 0;
        Iterator i1 = a1.iterator();
        Integer i2 = (Integer) i1.next();
        Integer i3 = (Integer) i1.next();
        while (i2 != 0 || i3 != 0) {
            int digit1 = i2 % 10;
            int digit2 = i3 % 10;
            diff += Math.abs(digit1 - digit2);
            i2 = i2 / 10;
            i3 = i3 / 10;
        }
        System.out.println(+diff);
    }
}
