
/*Q33. Write a program that takes an array of names and returns an array where only the first letter of each name is capitalized.

Examples
  (["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
  (["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
  (["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]*/
import java.util.*;

public class Question33 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element: ");
            String str = sc.next();
            a1.add(str);
            String result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            a2.add(result);
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}
