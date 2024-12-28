class Queue
{
    private class Node
    {
        String element;
        Node next;
        Node(String e, Node n)
        {
            element = e;
            next = n;
        }
    }

    Node front = null;
    Node rear = null;

    public void enqueue(String s)
    {
        if (rear != null)
        {
            rear.next = new Node(s, null);
            rear = rear.next;
        }
    }

    boolean empty()
    {
        return front == null;
    }

    public String dequeue()
    {
        if(empty())
            throw new IllegalStateException();
        else
        {
            String value = front.element;
            front = front.next;
            if(front == null)
            {
                rear = null;
            }
            return value;
        }
        
    }

    public void show(Node first)
    {
        Node curr = first;

        while (curr != null)
        {
            System.out.println(curr.element);
            curr = curr.next;
        }
    }

}