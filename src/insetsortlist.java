import java.util.ArrayList;

public class insetsortlist {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ArrayList<ListNode> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head);
            head = head.next;
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i - 1; j >= 0 && arr.get(j).val > arr.get(j + 1).val; j--) {
                ListNode temp = arr.get(j + 1);
                arr.remove(j + 1);
                arr.add(j, temp);
            }
        }
        ListNode help = new ListNode(0);
        ListNode cur = help;
        for (int i = 0; i < arr.size(); i++) {
            cur.next = arr.get(i);
            cur = cur.next;
        }
        cur.next=null;
        return help.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void printLinkedList(ListNode node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);
        node1.next.next.next = new ListNode(1);
       // node1.next.next.next.next = new ListNode(9);
        //node1.next.next.next.next.next= new ListNode(2);
       // node1.next.next.next.next.next.next = new ListNode(4);
       // node1.next.next.next.next.next.next.next = new ListNode(10);
        printLinkedList(insertionSortList(node1));
    }
}
