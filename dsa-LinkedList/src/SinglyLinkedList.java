
//representation of a singly linked list.
public class SinglyLinkedList {
    private static ListNode head;
    static class ListNode{
       final int  data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void showList(){
//  method to show the elements of singly Linked List
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int  getLength(){
//  method to show the length of a singly Linked List
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void addFirst(int data){
//  method to add the element at the beginning of a singly Linked List
        ListNode temp=new ListNode(data);
        temp.next=head;
        head=temp;
        System.out.println(temp.data+" added in beginning. ");

    }
    public void addLast(int data){
//  method to add  element at the end of singly Linked List
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
        System.out.println(temp.data +" added at the end of Linked list.");

    }
    public void addElement(int data,int position){
//  method to add element at any given position in a singly Linked list
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
        System.out.println(temp.data+" added at "+position +" place.");
    }
    public void delFirst(){
//  method to delete the first element of a singly Linked list
        if (head==null){
            return ;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        System.out.println(temp.data +" deleted !!");
    }

    public void delLast(){
//  method to delete the last element of a singly Linked list
        if(head==null || head.next==null){
            return;
        }
        ListNode current=head;
        ListNode previous=null;

        while(current.next!=null){
            previous=current;
            current=current.next;

        }
        previous.next=null;
        System.out.println(current.data+" deleted !!");


    }
    public void delElement(int position) {
// method to delete an element at a given position in a singly Linked list.
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode current = head;
            int count = 1;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
            System.out.println(position + " element deleted !!");
        }
    }
    public void searchElement(int data) {
//  method to search a given element in a singly Linked list.
        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current != null){
            if (current.data == data) {
                System.out.println(data + " found !!");
                return;
            }
        current = current.next;
    }
        System.out.println( data+" Not found");
    }
    public void revList(){
//  method to reverse the given singly Linked list.
        if(head==null){
            return ;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        System.out.println("Reversed !!");

    }

    public void midNode(){
//  method to find the middle node of a singly Linked list.
        if(head==null){
            return;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println("Middle element is "+slowPtr.data);

    }
    public void nFromEnd(int position){
//  method to find the nth node from the end in a singly Linked list.
        ListNode mainPtr=head;
        ListNode refPtr=head;
        int count=0;
        while(count<position){
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;

        }
        System.out.println("Element at "+position+" position from end is "+mainPtr.data);
    }
    public void removeDuplicate(){
//  method to remove duplicate elements from a given singly Linked list.
        ListNode current=head;
        while (current != null && current.next!=null ) {
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
            
        }
    }
    public void insertInSortedList(int data){
//  method to add elements in a sorted singly Linked list.
        ListNode node=new ListNode(data);
        if(head==null){
            return;
        }
        ListNode temp=null;
        ListNode current=head;
        while(current!=null && current.data<node.data){
            temp=current;
            current=current.next;
        }
        node.next=current;
        temp.next=node;
        System.out.println(data+" added.");
    }
    public void detectLoop(){
//  method to detect loop in  a given singly Linked list.
        if (head==null){
            return;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
                System.out.println("Loop detected !!");
                return;
            }
        }
        System.out.println("No loop detected.");
    }

    public ListNode startLoop(){
//  method to find the node from which loop originates in a singly Linked list.
        if (head==null){
            return head;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
              return getFirstNode(slowPtr);
            }
        }
        return null;
    }
    public ListNode getFirstNode(ListNode slowPtr){
        ListNode current=head;
        while(slowPtr!=current){
            current=current.next;
            slowPtr=slowPtr.next;
        }
        return current;

    }
    public void removeLoop(){
//  method to find the node from which loop originates in a singly Linked list.
        if (head==null){
            return ;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
                 removeLoops(slowPtr);
                 return;
            }
        }

    }
    public void removeLoops(ListNode slowPtr){
        ListNode current=head;

        while(current.next!=slowPtr.next){
            current=current.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=null;
    }
    public static ListNode merge(ListNode a,ListNode b){
//  method tp merge two sorted singly Linked list.
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
            if(a==null){
                tail.next=b;
            }
            else{
                tail.next=a;
            }

        }
        return dummy.next;
    }






}
