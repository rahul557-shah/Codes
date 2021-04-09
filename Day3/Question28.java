
/*Q28. Parity bits are used as a very simple checksum to ensure that binary data isn't corrupted during transit. Here's how they work:

If a binary string has an odd number of 1's, the parity bit is a 1.
If a binary string has an even number of 1's, the parity bit is a 0.
The parity bit is appended to the end of the binary string.
Write a program that adds the correct parity bit to a binary string.

Examples
  ("1011011") ➞ "10110111"
  // There are five 1's.
  // Since five is odd, the parity bit should be a 1.
  // Add the parity bit to the end of the string.
  // Return the result.

  ("0110000") ➞ "01100000"

  ("0101101") ➞ "01011010"

  ("1111111") ➞ "11111111"
Notes
  All inputs will be 7-bits long (so that the parity bit makes it a full byte).*/

import java.util.*;

public class Question28 {
  public static void main(String[] args) {
    System.out.println("Enter a String: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuffer str = new StringBuffer(s);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '1') {
        count++;
      }
    }
    if (count % 2 == 1) {
      str.append("1");
    } else {
      str.append("0");
    }
    System.out.println(str);
  }
}
