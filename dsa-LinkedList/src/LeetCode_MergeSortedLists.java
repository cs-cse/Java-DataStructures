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






}
