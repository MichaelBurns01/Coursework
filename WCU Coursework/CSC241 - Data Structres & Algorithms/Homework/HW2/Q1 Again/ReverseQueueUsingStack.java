import java.util.Scanner;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[20]; //
        int[] stack = new int[20]; 
        int front = -1, rear = -1;
        int top = 0;

        // Take 10 integers from the user and add them to the queue
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (rear == 9) {
                System.out.println("Queue Overflow");
            }
            if (front == -1 && rear == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            queue[rear] = num;
        }

        // Push all elements of the queue onto the stack
        while (front <= rear) {
            if (front == -1) {
                System.out.println("Queue Underflow");
                break;
            }
            stack[top++] = queue[front++];
        }

        // Pop all elements from the stack and add them back to the queue
        front = 0;
        rear = top;
        while (front <= rear) {
            queue[front++] = stack[top--];
        }

        // Print the reversed queue
        System.out.println("Reversed Queue:");
        for (int i = 0; i < 10; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
