import java.util.Scanner;

public class asign26 {
    
    // Declare variables
    private int front, rear, size;
    private int capacity;
    private int[] queue;
    
    // Constructor to initialize the queue
    public asign26(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }
    
    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }
    
    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Enqueue operation (Add an element to the queue)
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + element);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
            System.out.println(element + " enqueued to the queue");
        }
    }
    
    // Dequeue operation (Remove an element from the queue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        } else {
            int dequeuedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedElement;
        }
    }
    
    // Peek operation (View the front element of the queue)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        } else {
            return queue[front];
        }
    }
    
    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(queue[i] + " ");
            }
            System.out.println(queue[rear]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();
        
        asign26 queue = new asign26(capacity);
        
        int choice, element;
        
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        
        sc.close();
    }
}
