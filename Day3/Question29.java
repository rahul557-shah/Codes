/*Q29. Write a program that squares every digit of a number.

  Examples
    (9119) ➞ 811181

    (2483) ➞ 416649

    (3212) ➞ 9414
  Notes
    The function receives an integer and must return an integer.*/

import java.util.*;

public class Question29 {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String result = "";
    while (n != 0) {
      int rem = n % 10;
      result = rem * rem + result;
      n = n / 10;
    }
    int i1=Integer.parseInt(result);
    System.out.println(i1);
  }
}
