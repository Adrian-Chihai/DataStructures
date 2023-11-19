package UdemyCourse.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(4);
        linkedList.printList();

        linkedList.removeLast();
        linkedList.printList();

    }
}
