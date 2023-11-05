package Queues;

import java.util.*;

//queue -> FIFO (first in first out)
//queue -> is an interface (LinkedList and PriorityQueue implements queue interface

//enqueue -> add an object to tail of the queue
//dequeue -> remove an object from the head of the queue

//queue methods
//offer() -> enqueue, add an element to tail
//poll() -> dequeue, remove an element from head
//peek() -> will look at the head

// *****************************************************************

//priorityQueue -> FIFO (first in first out)
//priorityQueue sorts elements in ascending or descending order


public class Main {
    public static void main(String[] args) {
        priorityQueue();
    }

    public static void queue() {
        Scanner input = new Scanner(System.in);
        String name;
        Queue<String> queue = new LinkedList<String>();
        System.out.println("Line is empty? -> " + queue.isEmpty());

        for(int i = 0; i < 4; i++){

            System.out.print("Enter person " + i + " -> ");
            name = input.nextLine();
            queue.offer(name);
            System.out.println(queue.peek());

            if(i > 1){
                System.out.println(queue.poll() + " left");
                System.out.println(queue.peek() + " is first");
            }
        }
        System.out.println("Line is empty? -> " + queue.isEmpty());

    }

    public static void priorityQueue() {
        Queue<Integer> age = new PriorityQueue<>(Collections.reverseOrder());
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            age.offer(random.nextInt(90) + 1);
        }

        while (!age.isEmpty()){
            if (age.peek() > 20){
                System.out.println(age.poll() + " -> to old");
            } else {
                System.out.println(age.poll() + " -> won 10$");
            }
        }
    }
}
