public class Stack
{
    private int top;
    private int[] storage;

    Stack(int capacity)
    {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be positive");
        storage = new int[capacity];
        top = -1;
    }

    void push(int value)
    {
        if (top == storage.length)
            try {
                throw new Exception("Stack's underlying storage is overflow");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        top++;
        storage[top] = value;
    }

    int pop()
    {
        if (top == -1)
            try {
                throw new Exception("Stack is empty");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        int val = storage[top];
        top--;
        return val;
    }

    int peek()
    {
        if (top == -1)
            try {
                throw new Exception("Stack is empty");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        return storage[top];
    }

    public boolean empty()
    {
        if (storage[storage.length] == 0)
        {
            System.out.println("Stack is empty");
            return true;
        }
        else
            System.out.println("Stack not empty");
            return false;
    }
}