package UdemyCourse.DataStructures.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.prepend(0);
        linkedList.prepend(0);
        linkedList.prepend(1);
        linkedList.prepend(1);

        linkedList.printList();
        System.out.println(linkedList.getLength());

        System.out.println(linkedList.binaryToDecimal());
    }

}
