package DataStructures.queue;

public class CircularQueue {
    int size, front, rear;
    int[] queue;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        } else if (front == -1) { // First element
            front = 0;
            rear = 0;
            queue[rear] = data;
        } else {
            rear = (rear + 1) % size;
            queue[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        } else if (front == rear) { // Single element
            System.out.println("Dequeued: " + queue[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % size;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.display();

        cq.enqueue(50);
        cq.enqueue(60);

        cq.display();
    }
}
