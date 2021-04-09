
/*Q35. Write a program that takes an array of two numbers and determines if the sum of the digits in each number are equal to each other.

  Examples
    ([105, 42]) ➞ true
    # 1 + 0 + 5 = 6
    # 4 + 2 = 6

    ([21, 35]) ➞ false

    ([0, 0]) ➞ true*/
import java.util.*;

public class Question35 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter an element: ");
            int e = sc.nextInt();
            a1.add(e);
        }
        System.out.println(a1);
        int sum1 = 0, sum2 = 0;
        Iterator i1 = a1.iterator();
        Integer i2 = (Integer) i1.next();
        Integer i3 = (Integer) i1.next();
        while (i2 != 0 || i3 != 0) {
            int digit1 = i2 % 10;
            int digit2 = i3 % 10;
            sum1 += digit1;
            sum2 += digit2;
            i2 = i2 / 10;
            i3 = i3 / 10;
        }
        if (sum1 == sum2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
