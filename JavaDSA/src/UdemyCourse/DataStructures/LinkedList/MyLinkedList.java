package UdemyCourse.DataStructures.LinkedList;

import java.util.LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    //test commit

    public MyLinkedList(int val){
        Node node = new Node(val);
        head = node;
        tail = node;
        length = 1;
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

    public void printList() {
        Node node = head;
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
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
