package class_03;

public  class hascycle {
    public static boolean ifhasCycle(ListNode head) {
        if (head == null||head.next==null)
            return false;
        ListNode quick = head.next;
        ListNode slow = head;
        while (quick != slow) {
            if (quick.next.next == null || slow.next == null) {
                return false;
            }
            quick = quick.next.next;
            slow = slow.next;
        }
        return true;
    }

   static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args){
        ListNode head1 = new  ListNode(1);
        head1.next = new  ListNode(2);
        head1.next.next = new  ListNode(3);
        head1.next.next.next = new  ListNode(4);
        head1.next.next.next.next = new  ListNode(5);
        head1.next.next.next.next.next = new  ListNode(6);
        head1.next.next.next.next.next.next = new  ListNode(7);

        head1.next.next.next.next.next.next = head1.next.next;

        System.out.print(ifhasCycle(head1));
    }
}

