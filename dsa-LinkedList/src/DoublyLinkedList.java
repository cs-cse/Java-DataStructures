public class DoublyLinkedList {
    private ListNodeDouble head;
    private ListNodeDouble tail;
    private int length;
    private class ListNodeDouble{
        private int data;
        private ListNodeDouble next;
        private ListNodeDouble previous;

        public ListNodeDouble(int data) {
            this.data = data;
        }
    }
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }

    public void printForward(){
//  method to print the elements of a doubly Linked list from beginning.
        ListNodeDouble temp=head;
        while(temp!=null){
            System.out.println(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void printBackward(){
//  method to print the elements of a doubly Linked list from the end.
        ListNodeDouble temp=tail;
        while (temp!=null){
            System.out.println(temp.data+" -> ");
            temp=temp.previous;
        }
        System.out.println("null");
    }
    public void addBeginning(int data){
//  method to add the elements of a doubly Linked list from beginning.
        ListNodeDouble temp=new ListNodeDouble(data);
        if(isEmpty()){
            tail=temp;
        }
        else{
            head.previous=temp;
        }
        temp.next=head;
        head=temp;

    }
    public void addEnd(int data){
//  method to add the elements of a doubly Linked list from the end.
        ListNodeDouble temp=new ListNodeDouble(data);
        if(isEmpty()){
            head=temp;
        }
        else{
            tail.next=temp;
            temp.previous=tail;
        }
        tail=temp;

    }
    public void delFirst(){
        if(head==tail){
            tail=null;
        }
        else{
            head.previous.next=null;

        }
        ListNodeDouble temp=head;
        head=head.next;
        temp.next=null;
    }

}

