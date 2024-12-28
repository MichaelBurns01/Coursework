public class Queue
{
    private int[] q = new int[100];
    private int front = q[0];
    private int rear = q[q.length - 1];

    public void enqueue(int x)
    {
        q[rear + 1] = x;
        rear = rear +1;
    }

    public void dequeue()
    {
        int element = q[front];
        q[front] = (Integer) null;
        front ++;
    }

    public void show()
    {
        for (int i = 0; i < q.length; i++)
        {
            System.out.println(q[i] + " ");
        }
    }

}