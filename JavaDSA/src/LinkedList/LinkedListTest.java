package LinkedList;

public class LinkedListTest {
    private Node head;
    private Node tail;
    private int size;
    LinkedListTest(){
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertHead(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (size == 0){
            tail = head;
        }

        size++;
    }

    public void insertTail(int val){
        if(size == 0){
            insertHead(val);
        } else {
            Node node = new Node(val);
            Node secondLast = getNode(size);

            secondLast.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int index, int val){
        if (index == 0){
            insertHead(val);
        } else if (index == size){
            insertTail(val);
        } else {

            Node prevElement = getNode(index);
            Node node = new Node(val, prevElement.next);
            prevElement.next = node;

            size++;
        }
    }

    public void deleteHead(){
        head = head.next;
        size--;
    }

    public void deleteTail(){
        if (size == 1){
            deleteHead();
        } else {
            Node secondLast = getNode(size - 1);
            secondLast.next = null;
            tail = secondLast;
            size--;
        }
    }

    public void delete(int index){
        if(index == 0){
            deleteHead();
        } else if(index == size){
            deleteTail();
        } else {
            Node prevELement = getNode(index);
            prevELement.next = getNode(index + 1).next;
            size--;
        }
    }

    public void displayList(){
        Node node = head;

        while (node != null){
            if(node.next == null){
                System.out.print(node.value);
            } else {
                System.out.print(node.value + " -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    private Node getNode(int index){
        Node node = head;

        for(int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    private static class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
