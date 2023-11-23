package UdemyCourse.DataStructures.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.prepend(1);
        linkedList.prepend(2);
        linkedList.prepend(2);
        linkedList.prepend(2);
        linkedList.prepend(3);
        linkedList.prepend(4);
        linkedList.prepend(4);

        linkedList.printList();
        linkedList.removeDublicates();
        linkedList.printList();
    }

}
