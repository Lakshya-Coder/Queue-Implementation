package QueueImplementionByDoublyLinkedList;

public class Queue <T> implements Iterable<T> {

    private java.util.LinkedList <T> list = new java.util.LinkedList <> ();

    public Queue() {

    }

    public Queue(T first_elem) {
        offer(first_elem);
    }

    // Return the size of the queue
    public int size() {
        return list.size();
    }

    // Return whether or not the queue is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Peek the element at the front of the queue
    // The method is throws an error is the queue is empty
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.peekFirst();
    }

    // Pool the element from the front of the queue
    // The method throw an error is the queue is empty
    public T poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }
        return list.removeFirst();
    }

    // Add an element to the back of the queue
    public void offer(T elem) {
        list.addLast(elem);
    }

    // Return the iterator to allow the user to traverse
    // through the element fount inside the queue
    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }

    // This is toString() method for print
    // the queue
    @Override
    public String toString() {
        return list.toString();
    }
}
