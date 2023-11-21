package UdemyCourse.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < 6; i++){
            linkedList.insert(i, i);
        }
        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.findMiddleElement().val);
    }
}
