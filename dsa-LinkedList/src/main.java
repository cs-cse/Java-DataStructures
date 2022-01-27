public class main {
    public static void main(String[] args) {

        SinglyLinkedList newList=new SinglyLinkedList();
        newList.showList();
        System.out.println("The length of Linked list is : "+newList.getLength());
        newList.addFirst(21);
        newList.addFirst(22);
        newList.addFirst(23);
        newList.addLast(24);
        newList.addElement(20,1);
        newList.delFirst();
        newList.delLast();
        newList.delElement(2);
        newList.searchElement(21);
        newList.addFirst(25);
        newList.addFirst(26);
        newList.addFirst(27);
        newList.revList();


    }
}
