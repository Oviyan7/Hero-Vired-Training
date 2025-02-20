public class Circularqueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Circularqueue(int k) {
        capacity = k;
        queue = new int[capacity];
        head = 0;
        tail = -1;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % capacity;
        queue[tail] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Circularqueue circularqueue = new Circularqueue(3);
        circularqueue.enQueue(1);
        circularqueue.enQueue(2);
        circularqueue.enQueue(3);
        System.out.println("Is full: " + circularqueue.isFull()); 
        System.out.println("Front: " + circularqueue.Front());   
        circularqueue.deQueue();
        System.out.println("Front after dequeue: " + circularqueue.Front()); 
    }
}
