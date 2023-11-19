package UdemyCourse.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(4);
        for (int i = 0; i < 10; i++){
            linkedList.prepend(i*2);
        }
        linkedList.printList();
        System.out.println();

        System.out.println(linkedList.getNode(4).val);
    }
}
