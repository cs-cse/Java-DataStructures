
//representation of a singly linked list.
public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
       private int  data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void showList(){
//        method to show the elements of singly LinkedList
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int  getLength(){
        //        method to show the length of a singly LinkedList
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }
    public void addFirst(int data){
        //        method to add the element at the beginning of a singly LinkedList
        ListNode temp=new ListNode(data);


        temp.next=head;
        head=temp;

        System.out.println(temp.data+" added in beginning ");

    }
    public void addLast(int data){
        //        method to add  element at the end of singly LinkedList
        ListNode temp=new ListNode(data);
        if(head==null){
            head=temp;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;

    }
    public void addElement(int position,int data){
        ListNode temp=new ListNode(data);
        int count=1;
        if(position==1){
            temp.next=head;
            head=temp;
        }
        ListNode current=head;
        while(count<position-1){
            count++;
            current=current.next;

        }

        current.next=temp;
        temp.next=current.next.next;

    }






}
