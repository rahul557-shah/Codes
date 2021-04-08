
/*Q22. Create a singly linked list. Swap every two adjacent nodes and return the reordered list.
Expamples:
Input: 1->2->3->4
Output: 2->1->4->3
Input:  1
Output: 1*/
import java.util.*;

public class Question22 {
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
        for (int i = 0; i < n; i+=2) {
            Collections.swap(l1, i, i + 1);
        }

        System.out.println(l1);
    }
}
