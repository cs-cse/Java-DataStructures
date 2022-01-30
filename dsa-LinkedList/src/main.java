public class main {
    public static void main(String[] args) {

        SinglyLinkedList newList=new SinglyLinkedList();

        newList.showList();
        System.out.println("The length of Linked list is : "+ newList.getLength());
        newList.addFirst(20);
        newList.addLast(24);
        newList.addElement(20,1);
        newList.delFirst();
        newList.delLast();
        newList.delElement(2);
        newList.searchElement(21);
        newList.showList();
        newList.midNode();
        newList.nFromEnd(2);
        newList.removeDuplicate();
        newList.showList();
        newList.detectLoop();


    }
}
