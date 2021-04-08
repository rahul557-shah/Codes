
/*
 * Q21. Create a singly linked list. Group all the nodes with odd indices
 * together followed by the nodes with even indices, and return the reordered
 * list. The first node is considered odd, and the second node is even, and so
 * on. Note that the relative order inside both the even and odd groups should
 * remain as it was in the input. Expamples: Input: 1->2->3->4->5 Output:
 * 1->3->5->2->4 Input: 2->1->3->5->6->4->7 Output: 2->3->6->7->1->5->4
 */
import java.util.*;

public class Question21 {
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
        int k = 1;
        for (int i = 1; i < (n + 1) / 2; i++) {
            Collections.swap(l1, i, i + k);
            k++;
        }
        for (int i = n - 2; i < n; i++) {
            Collections.swap(l1, i, n - 1);
        }
        System.out.println(l1);
    }
}
