package UdemyCourse.DataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println();
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
        Node fast = head;
        for(int i = 0; i < k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        Node slow = head;
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void partitionList(int x){
        if(head == null){
            return;
        }

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node curent = head;

        while (curent != null){
            if(curent.val < x){
                prev1.next = curent;
                prev1 = curent;
            } else {
                prev2.next = curent;
                prev2 = curent;
            }
            curent = curent.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }

    public void removeDublicates(){

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
