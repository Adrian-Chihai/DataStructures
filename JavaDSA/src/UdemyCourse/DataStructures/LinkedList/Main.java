package UdemyCourse.DataStructures.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
//        linkedList.append(4);
//        linkedList.append(5);
//        linkedList.append(6);
//        linkedList.printList();

        linkedList.reverseBetween(1,2);
        linkedList.printList();
    }

}
