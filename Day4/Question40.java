/*
 * Q40. Given two strings s and t, check if s is a subsequence of t. A
 * subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (i.e., "ace" is a
 * subsequence of "abcde" while "aec" is not). Examples: Input: s = "abc", t =
 * "ahbgdc" Output: true Input: s = "axc", t = "ahbgdc" Output: false Collapse
 */

import java.util.*;

public class Question40 {
    public boolean sequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
            if (index >= s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter two strings string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Question40 obj = new Question40();
        System.out.println(obj.sequence(s, t));
    }
}
