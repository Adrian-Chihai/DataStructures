package UdemyCourse.DataStructures.DoublyLinkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyDoubleLL dll = new MyDoubleLL();
        for (int i = 0; i < 10; i++){
            dll.append(random.nextInt(20));
        }
        dll.printList();
        dll.swapFirstLast();
        dll.printList();
        dll.reverse();
        dll.printList();
    }
}
