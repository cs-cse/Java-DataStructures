public class addLinkedLists {

    public static SinglyLinkedList.ListNode addLists(SinglyLinkedList a, SinglyLinkedList b){
//  method to get the sum of two singly Linked list.
        SinglyLinkedList.ListNode dummy=new SinglyLinkedList.ListNode(0);
        SinglyLinkedList.ListNode tail=dummy;
        int carry=0;
        int x = (a != null) ? a.data : 0;
        int y = (b != null) ? b.data : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        tail.next = new SinglyLinkedList.ListNode(sum % 10);
        tail = tail.next;
        if (a != null) {
            a = a.next;
        }
        if (b != null) {
            b = b.next;
        }

            if(carry>0){
        tail.next=new SinglyLinkedList.ListNode(carry);
    }
            return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList a=new SinglyLinkedList();
        SinglyLinkedList b=new SinglyLinkedList();
        SinglyLinkedList.ListNode c=addLists(a,b);

    }

    }



