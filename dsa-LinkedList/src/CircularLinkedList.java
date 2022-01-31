import java.util.NoSuchElementException;

public class CircularLinkedList {
    private ListNodeCircular last;
    private int length;
    private class ListNodeCircular{
        private ListNodeCircular next;
        private int data;

        public ListNodeCircular(int data) {
            this.data = data;

        }
    }

    public CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void createCircularList(){
        ListNodeCircular first=new ListNodeCircular(10);
        ListNodeCircular second=new ListNodeCircular(11);
        ListNodeCircular third=new ListNodeCircular(12);
        ListNodeCircular fourth=new ListNodeCircular(13);
        ListNodeCircular fifth=new ListNodeCircular(14);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;
        last=fifth;
}
    public void traverseList(){
//  method to traverse and print all the elements of Circular linked list.
        if(last==null){
            return;
        }
        ListNodeCircular first=last.next;
        while(first!=last){
            System.out.print(first.data+" -> ");
            first=first.next;
        }
    System.out.println(first.data+" ");
}
    public void addElement(int data){
//  method to add element at the beginning of Circular linked list.
    ListNodeCircular temp=new ListNodeCircular(data);
    if(last==null){
        last=temp;
    }
    else{
        temp.next=last.next;
    }
    last.next=temp;
    length++;
}
    public void addLast(int data) {
//  method to add the element at the end of Circular linked list.
    ListNodeCircular temp=new ListNodeCircular(data);
    if(last==null){
        last=temp;
        last.next=last;
    }
    else{
        temp.next=last.next;
        last.next=temp;
        last=temp;
    }
    length++;
    }
    public void delFirst(){
//  method to remove an element from the beginning of Circular linked list.
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNodeCircular temp=last.next;
        if(last.next==last){
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;



    }


    public static void main(String[] args) {
        CircularLinkedList circularLinkedList=new CircularLinkedList();
        circularLinkedList.createCircularList();
        circularLinkedList.traverseList();
    }





}
