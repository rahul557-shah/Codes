/*Q25. An isogram is a word that has no duplicate letters. Write a program that takes a string and returns either true or false depending on whether or not it's an "isogram".

  Examples
    ("Algorism") ➞ true

    ("PasSword") ➞ false
    // Not case sensitive.

    ("Consecutive") ➞ false
  
  Notes
    Ignore letter case (should not be case sensitive).
    All test cases contain valid one word strings.*/

import java.util.*;

public class Question25 {
    public boolean is_isogram(String str) {
        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Question25 obj = new Question25();
        System.out.println(obj.is_isogram(str));
    }
}
