
/*Q30. Write a program that returns the mean of all digits.
  Examples
    (42) ➞ 3

    (12345) ➞ 3

    (666) ➞ 6
  
  Notes
    The mean of all digits is the sum of digits / how many digits there are (e.g. mean of digits in 512 is (5+1+2)/3(number of digits) = 8/3=2).
    The mean will always be an integer.*/
import java.util.*;

public class Question30 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, rem;
        int count = 1;
        while (n != 0) {
            rem = n % 10;
            sum += rem;
            n /= 10;
            count += 1;
        }
        int res = sum / (count - 1);
        System.out.println(+res);
    }
}
