import java.util.NoSuchElementException;

public class Queue<S> {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length=0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
//  method to add elements in a queue.
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
}
    public void dequeue(){
//  method to add elements in a queue.
    if(isEmpty()){
        throw new NoSuchElementException();
    }
        if(front==null){
            rear=null;
        }
    int result= front.data;
    front=front.next;
    length--;
    }
    public static void main(String[] args) {

    }
}
