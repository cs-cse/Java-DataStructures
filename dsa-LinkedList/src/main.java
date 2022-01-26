public class main {
    public static void main(String[] args) {
        SinglyLinkedList newList=new SinglyLinkedList();
        newList.showList();
        System.out.println(newList.getLength());
        newList.addFirst(21);
        newList.showList();
        newList.addLast(22);
        newList.showList();
        newList.addElement(20,1);
        newList.showList();
        newList.delFirst();
        newList.showList();
    }
}
