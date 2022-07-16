public class Queue {
    //total capacity of the queue
    private int capacity;
    //front and rear of the queue
    private int front, rear;
    //array to store the elements of the queue
    private int[] queue;

    //constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = -1;
        this.queue = new int[capacity];
    }

    //enqueue an element to the queue
    public void enqueue(int element) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = element;
    }

    //dequeue an element from the queue
    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[++front];
    }

    //peek the front element of the queue
    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    //check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    //check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    //print the queue

    public void printQueue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
