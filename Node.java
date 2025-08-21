class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null; // Use this for temporarily storing the next node

        while (current != null) {
            // STEP 1: Store the next node before you change any pointers.
            // (Your code had 'next = head.next', which was the main error)
            next = current.next;

            // STEP 2: This is the actual reversal. Make the current node
            // point backwards to the 'previous' node.
            current.next = previous;

            // STEP 3: Move your pointers one step forward for the next loop iteration.
            // 'previous' becomes the node you just processed.
            previous = current;
            // 'current' becomes the node you saved in Step 1.
            current = next;
        }

        // When the loop is done, 'current' will be null, and 'previous'
        // will be at the last node (which is the new head).
        return previous;
    }
}