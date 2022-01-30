public class LeetCode_MergeSortedLists {

    private static ListNodes head;
    private static class ListNodes{
         final int data;
         ListNodes next;

        public ListNodes(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNodes merge(ListNodes a, ListNodes b){
//  method tp merge two sorted singly Linked list.
        ListNodes dummy=new ListNodes(0);
        ListNodes tail=dummy;
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
    public static void showLists(){
//  method to show the elements of singly Linked List
        ListNodes current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void addLast(int data){
//  method to add  element at the end of singly Linked List
        ListNodes temp=new ListNodes(data);
        if(head==null){
            head=temp;
            return;
        }
        ListNodes current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;
        System.out.println(temp.data +" added at the end of Linked list.");

    }
    public static void main(String[] args) {
        LeetCode_MergeSortedLists ll=new LeetCode_MergeSortedLists();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(8);

        LeetCode_MergeSortedLists ll2=new LeetCode_MergeSortedLists();
        ll2.addLast(3);
        ll2.addLast(5);
        ll2.addLast(7);
        ll2.addLast(17);

        ll.showLists();
        ll2.showLists();

    }




}
