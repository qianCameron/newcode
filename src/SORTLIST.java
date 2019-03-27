public class SORTLIST {
    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        return sort(head,tail);
    }
    public static ListNode findmid(ListNode head,ListNode tail){
        if(head==tail||head.next==tail) return head;
        ListNode mid=head;
        ListNode f=head.next;
        while(f!=tail.next&&f.next!=tail.next){
            mid=mid.next;
            if(f.next.next==tail.next){
                break;
            }
            else
                f=f.next.next;
        }
        return mid;
    }
    public static ListNode sort(ListNode head,ListNode tail){
        if(head==tail) return head;;
        ListNode mid=findmid(head,tail);
        sort(head,mid);
        sort(mid.next,tail);

        return merge(head,mid,tail);
    }
    public static ListNode merge(ListNode head,ListNode mid,ListNode tail){
        ListNode p1=head;
        ListNode p2=mid.next;
        mid.next=null;
        ListNode help=new ListNode(0);
        ListNode pretend=help;
        while(p1!=null&&p2!=tail.next){
            if(p1.val<=p2.val){
                pretend.next=p1;
                p1=p1.next;
                pretend=pretend.next;
            }
            else{
                pretend.next=p2;
                p2=p2.next;
                pretend=pretend.next;
            }

        }
        while(p1!=null){
            pretend.next=p1;
            p1=p1.next;
            pretend=pretend.next;
        }
        while(p2!=tail.next){
            pretend.next=p2;
            p2=p2.next;
            pretend=pretend.next;
        }
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
    node1.next.next.next.next = new ListNode(9);
    node1.next.next.next.next.next= new ListNode(2);
    node1.next.next.next.next.next.next = new ListNode(4);
    node1.next.next.next.next.next.next.next = new ListNode(10);
    printLinkedList(sortList(node1));
}
}
