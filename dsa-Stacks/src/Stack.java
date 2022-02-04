import java.util.EmptyStackException;


public class Stack  {
    private LisNode top;
    private int length;
    private class LisNode{
        private int data;
        private LisNode next;


        public LisNode(int data) {
            this.data = data;
        }


    }
    public Stack() {
        this.top = null;
        this.length=0;
    }

    public void push(int data){
//  method to add an element in the stack.
        LisNode temp=new LisNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int  pop(){
//  method to remove an element from the stack.
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int ele=top.data;
        top=top.next;
        length--;
        return ele;

    }
    public boolean isEmpty(){
        return length==0;
    }
    public int  peek(){
//  method to show the recently added element in the stack.
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(8);
        s1.push(9);
        s1.push(10);
        s1.push(11);
        s1.pop();
        System.out.println(s1.peek());
    }
}
