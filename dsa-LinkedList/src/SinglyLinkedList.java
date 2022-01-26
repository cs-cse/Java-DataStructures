
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
//        method to show the elements of singly Linked List
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int  getLength(){
        //        method to show the length of a singly Linked List
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void addFirst(int data){
        //        method to add the element at the beginning of a singly Linked List
        ListNode temp=new ListNode(data);
        temp.next=head;
        head=temp;
        System.out.println(temp.data+" added in beginning ");

    }
    public void addLast(int data){
        //        method to add  element at the end of singly Linked List
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
    public void addElement(int data,int position){
//        method to add element at any given position in a singly Linked list
        ListNode temp=new ListNode(data);
        if(position==1){
            temp.next=head;
            head=temp;
        }
        else{
            ListNode previous=head;
            int count=1;

            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            temp.next=current;
            previous.next=temp;
        }
    }
    public void delFirst(){
//        method to delete the first element of a singly Linked list
        if (head==null){
            return ;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
    }






}
