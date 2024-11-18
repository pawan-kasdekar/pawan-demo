import java.util.Scanner;

public class StackUsingArray {
    
    // Declare the stack variables
    private int top;
    private int capacity;
    private int[] stack;
    
    // Constructor to initialize the stack
    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; // Stack is empty initially
    }
    
    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Push operation (Add an element to the stack)
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed to stack");
        }
    }
    
    // Pop operation (Remove and return an element from the stack)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int poppedElement = stack[top--];
            return poppedElement;
        }
    }
    
    // Peek operation (View the top element of the stack)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        } else {
            return stack[top];
        }
    }
    
    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the capacity of the stack: ");
        int capacity = sc.nextInt();
        
        StackUsingArray stack = new StackUsingArray(capacity);
        
        int choice, element;
        
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    stack.display();
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
