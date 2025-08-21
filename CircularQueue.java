public class CircularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;

    public CircularQueue(int size) {
        capacity = size;
        queueArray = new int[capacity];
        front = 0;
        rear = -1; // We start rear at -1
        currentSize = 0;
    }

    // Your code goes here
    public void enqueue(int value) {
        // 1. Check if the queue is full (currentSize == capacity). If so, print an error.
        // 2. If not, calculate the new rear index using the modulo operator.
        // 3. Add the new value at the new rear index.
        // 4. Increment the currentSize.
        if(currentSize == capacity) {
            System.out.println("Queue is full");
        }else {
            rear = (rear + 1) % capacity;
            queueArray[rear] = value;
            currentSize++;
        }
    }

    // Your code goes here
    public int dequeue() {
        // 1. Check if the queue is empty (currentSize == 0). If so, print an error and return -1.
        // 2. If not, get the value from the front of the queue.
        // 3. Calculate the new front index using the modulo operator.
        // 4. Decrement the currentSize.
        // 5. Return the value you got in step 2.
        if(currentSize == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }else {
            int elementToBeRemoved = queueArray[front];
            front = (front + 1) % capacity;
            currentSize--;
            return elementToBeRemoved;
        }
    }
}