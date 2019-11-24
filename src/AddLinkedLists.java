/**
 * AddLinkedLists
 */
public class AddLinkedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        // int sumL1 = getDigits(l1);
        // System.out.println(sumL1);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        // int sumL2 = getDigits(l2);
        // System.out.println(sumL2);

        // System.out.println(sumL1 + sumL2);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(getDigits(result));
    }
    
    public static int getDigits(ListNode list) {
        int sum = 0, count = 0;
        ListNode current = list;
        while (current != null) {
            sum += Math.pow(10, count++) * current.val;
            current = current.next;
        }
        return sum;
    }

    // public static ListNode getSingleDigits(int digits) {
    //     ListNode newNode = null;
    //     ListNode current = null;
    //     while (digits > 0) {
    //         ListNode node = new ListNode(digits % 10);
    //         if (newNode == null) {
    //             newNode = node;
    //             newNode.next = current;
    //         } else {
    //             current = node;
    //             current.next = null;
    //         }
    //         digits /= 10;
    //     }

    //     return newNode;
    // }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode newNode = new ListNode(0);
        ListNode prev = newNode;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            prev.next = new ListNode(sum % 10);
            sum /= 10;
            prev = prev.next;
        }

        return newNode.next;
    }
    
}

class ListNode {
    int val;
    ListNode next;
    
    public ListNode (int x) {
        val = x;
    }
}