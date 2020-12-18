package QueueImplementionByDoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue <Integer> queue = new Queue <> (1);

        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }

}
