package collection_framework.queue;

import java.util.*;

public class Main {
}
class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(5);
        adq.offerFirst(2);
        adq.offer(9);
        System.out.println(adq);
    }
}
class LearnPriorityQueue {
    public static void main(String[] args) {
        //By default min heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Comparator.reverseOrder() for max heap
        pq.offer(4);
        pq.offer(1);
        pq.offer(99);
        pq.offer(53);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(35);
        queue.offer(87);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
