/*Q23. Create a singly linked-list. The list can be represented as:
  L0 -> L1 -> … → Ln - 1 -> Ln
  Reorder the list to be in the following form:
  L0 -> Ln -> L1 → Ln - 1 -> L2 -> Ln - 2 -> …
  You can not modify the values in the list's nodes. Only nodes themselves can be changed.
  Expamples:
  Input: 1->2->3->4
  Output: 1->4->2->3
  Input: 1->2->3->4->5
  Output: 1->5->2->4->3*/

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements: ");
            int num = sc.nextInt();
            l1.add(num);
        }
        System.out.println(l1);
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                Collections.swap(l1, i, n - 1);
            }
        } else {
            for (int i = 1; i < n - 2; i++) {
                Collections.swap(l1, i, n - 1);
            }
        }
        System.out.println(l1);
    }
}
