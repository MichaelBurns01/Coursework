import java.util.*;

class ReverseQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = in.nextInt();

        System.out.print("Elements: ");
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(in.nextInt());
        }

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}