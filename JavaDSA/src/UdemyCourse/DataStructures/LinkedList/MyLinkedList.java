package UdemyCourse.DataStructures.LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int val){
        Node node = new Node(val);
        head = node;
        tail = node;
        length = 1;
    }

    public MyLinkedList(){

    }

    public int getHead() {
        return head.val;
    }
    public int getTail() {
        return tail.val;
    }
    public int getLength() {
        return length;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public void append(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0){
            return null;
        }

        Node node = head;
        head = head.next;
        node.next = null;
        length--;

        if (length == 0){
            tail = null;
        }

        return node;
    }

    public Node removeLast(){
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node getNode(int index){
        if(index == 0){
            return head;
        } else if(index == length - 1){
            return tail;
        } else if(index < 0 || index > length - 1){
            return null;
        }
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public boolean setNode(int index, int value){
        Node node = getNode(index);
        if(node == null){
            return false;
        }
        node.val = value;
        return true;
    }

    public boolean insert(int index, int val){
        if(index < 0 || index > length + 1){
            return false;
        }
        if(index == 0){
            prepend(val);
            return true;
        }

        if(index == length){
            append(val);
            return true;
        }
        Node prevNode = getNode(index - 1);
        if(prevNode == null){
            return false;
        }
        Node node = new Node(val);
        node.next = prevNode.next;
        prevNode.next = node;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index > length){
            return null;
        }
        Node temp;
        if (index == 0){
            return removeFirst();
        } else if (index == length - 1){
            return removeLast();
        } else {
            Node node = getNode(index - 1);
            temp = node.next;
            node.next = node.next.next;
        }
        length--;
        return temp;
    }

    public void printList() {
        Node node = head;
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleElement(){
        Node slow = head;
        Node fast = head;
        int len = 0;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            len += 2;
        }
        return slow;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        int cycle = 0;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k){
        if(k == 0){
            return tail;
        }

    }

    class Node {
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
        Node (int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
