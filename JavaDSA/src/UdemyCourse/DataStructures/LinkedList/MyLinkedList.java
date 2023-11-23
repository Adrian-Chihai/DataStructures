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

    //we move fast k steps ahead so when k will be null the slow node will pe pointing to len - k node on lis
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
        /*I need to rearrange the list so all the elements :
          * smaller than x will be on the left side and all the elements
          * greater or equal to x on the right side
          * */

        //check if the list is empty
        if(head == null){
            return;
        }

        Node current = head;
        Node newNode = new Node(0);
        Node prev = newNode;
        while (current != null){
            if(current.val >= x){
                current = current.next;
            } else if(current.val < x){
                current = current.next;
            }
        }
    }

    public int binaryToDecimal(){
        if(head == null){
            return 0;
        }
        int num = 0;
        Node current = head;

        while (current != null){
            if(current.val == 0){
                num++;
            } else {
                num = num * 2 + current.val;
            }
            current = current.next;
        }
        return num;
    }

    public void removeDublicates(){
        if(head == null){
            return;
        }

        /*create a node that points to curent value
        * NOTE IT:
        * I start from head.next this means automatically my head is added in set and I start to check from head.next
        * When this algortihm finds a value that is in this set data structure I move the prev.next to curent that next
        * SO IF I FIND SOMETHING LIKE THAT
        * 1 -> 2 -> 2 -> 3 -> 4
        * set.add(1), set.add(2)
        * when I find the second 2 the linked list will become
        * 1 -> 2 -> 3
        *       \
        *        2 -> this 2 is removed as neighbour
        * */

        Node current = head.next;
        Node prev = head;
        Set<Integer> nodesSet = new HashSet<>();
        nodesSet.add(prev.val);
        while (current != null){
            if(nodesSet.contains(current.val)){
                prev.next = current.next;
                current = current.next;
                length--;
            } else {
                nodesSet.add(current.val);
                prev = prev.next;
                current = current.next;
            }
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
