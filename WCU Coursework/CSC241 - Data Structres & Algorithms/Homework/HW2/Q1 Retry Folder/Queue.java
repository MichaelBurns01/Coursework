public class Queue
{
    private int[] q = new int[25];
    private int front = q[0];
    private int rear = q[q.length - 1];

    public void enqueue(int x)
    {
        q[rear + 1] = x;
        rear = rear +1;
    }

    public int dequeue()
    {
        int element = q[front];
        q[front] = (Integer) null;
        front ++;
        return front;
    }
    
    public boolean empty()
    {
        if (q.length == 0)
        {
            System.out.println("Stack is empty");
            return true;
        }
        else
            System.out.println("Stack not empty");
            return false;
    }

    public void show(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

}