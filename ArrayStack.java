public class ArrayStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1; // We initialize top to -1 to indicate the stack is empty
    }

    // Your code goes here
    // Method to add an element to the top of the stack
    public void push(int value) {
        // 1. Check if the stack is full (top == capacity - 1). If so, print an error.
        // 2. If not full, increment the top.
        // 3. Add the new value at the top index of the array.

        if(top == capacity - 1) {
            System.out.println("Stack overflow!");
        }else {
            top++;
            stackArray[top] = value;
        }
    }

    // Your code goes here
    // Method to remove and return the element from the top of the stack
    public int pop() {
        // 1. Check if the stack is empty (top == -1). If so, print an error and return -1.
        // 2. If not empty, get the value at the top index.
        // 3. Decrement the top.
        // 4. Return the value you got in step 2.

        int toBeRemoved = -1;
        if(top == -1) {
            System.out.println("Stack is empty!");

        }else {
            toBeRemoved = stackArray[top];
            top--;
        }

        return toBeRemoved;
    }
}