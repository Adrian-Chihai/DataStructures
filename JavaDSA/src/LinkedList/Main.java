package LinkedList;

import java.util.LinkedList;
//LinkedList = stores Nodes in 2 parts (data + address)
//              Nodes are non-consecutive memory location
//              Elements are linked using pointers
//In singly linkedList every node knows about next
//In doubly linkedList every node knows about prev and next nodes
public class Main {
    public static void main(String[] args) {
        linkedList();
        testLinkedList();
    }

    public static void linkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(5);

        System.out.println(linkedList);

        linkedList.add(1,4);
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst() + " " + linkedList.peekLast());

    }

    public static void testLinkedList(){
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.insertHead(1);
        linkedListTest.insertHead(2);
        linkedListTest.insertHead(3);
        linkedListTest.displayList();
        linkedListTest.insertTail(54);
        linkedListTest.insertTail(43);
        linkedListTest.displayList();

        linkedListTest.insert(1, 5412);
        linkedListTest.displayList();

        linkedListTest.deleteHead();
        linkedListTest.displayList();

        linkedListTest.deleteTail();
        linkedListTest.displayList();

        linkedListTest.delete(1);
        linkedListTest.displayList();

        System.out.println(linkedListTest.getSize());
    }
}
