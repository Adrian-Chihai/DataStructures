package UdemyCourse.DataStructures.DoublyLinkedList;

public class MyDoubleLL {
    private Node head;
    private Node tail;
    private int length;

    public MyDoubleLL(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public MyDoubleLL(){
        length = 0;
    }

    public void getHead(){
        try {
            System.out.println("Head : " + head.val);
        } catch (NullPointerException e){
            System.out.println("Empty list.");
        }
    }
    public void getTail() {
        try {
            System.out.println("Tail : " + tail.val);
        } catch (NullPointerException e){
            System.out.println("Empty list.");
        }
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }

    public void prepend(int val){
        Node node = new Node(val);
        if(length == 0){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public void append(int val){
        Node node = new Node(val);
        if(length == 0){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    public boolean insertNode(int index, int val){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(val);
        } else if(index == length){
            append(val);
        } else {
            Node node = head;
            Node newNode = new Node(val);
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            newNode.next = node;
            newNode.prev = node.prev;
            node.prev.next = newNode;
            node.prev = newNode;
            length++;
        }
        return true;
    }

    public void deleteFirst(){
        if (length == 0) {
            System.out.println("Empty List");
            return;
        }else if(length == 1) {
            head = null;
            tail = null;
        }else {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
    }

    public void deleteLast(){
        if (length == 0) {
            System.out.println("Empty List");
            return;
        }else if(length == 1){
            head = null;
            tail = null;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
    }

    public void deleteNode(int index){
        if(index < 0 || index > length - 1){
            return;
        }
        if (index == 0){
            deleteFirst();
        } else if (index == length - 1){
            deleteLast();
        } else {
            Node node = head;
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            node.next.prev = node.prev;
            node.prev.next = node.next;
            length--;
        }
    }

    public boolean setNode(int index, int val){
        if(index < 0 || index > length){
            return false;
        }
        Node newNode = new Node(val);
        if (index == 0){
            newNode.next = head.next;
            head.next.prev = newNode;
            head = newNode;
        } else if (index == length - 1){
            tail.prev.next = newNode;
            newNode.prev = tail.prev;
            tail = newNode;
        } else {
            Node node = head;
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            node.val = newNode.val;
        }
        return true;
    }
    public Node getNode(int index){
        if (index < 0 || index > length - 1){
            return null;
        }
        if (index == 0){
            return head;
        } else if (index == length - 1){
            return tail;
        }
        Node node = head.next;
        for (int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void swapFirstLast(){
        System.out.println("Swap head - tail");
        if (length <= 1){
            return;
        }
        int hV = head.val;
        int tV = tail.val;

        head.val = tV;
        tail.val = hV;
    }

    public void reverse(){
        System.out.println("Reverse");
    }

    class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
}
