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

        System.out.println(dll.getNode(5).val);
        dll.setNode(4, 90);
        dll.printList();

        dll.insertNode(9, 930);
        dll.printList();

        dll.deleteNode(3);
        dll.printList();

    }
}
