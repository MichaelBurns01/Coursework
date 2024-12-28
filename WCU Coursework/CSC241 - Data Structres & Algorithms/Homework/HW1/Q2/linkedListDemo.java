import java.util.ArrayList;

public class linkedListDemo
{
    /**
     * @param args
     */

     public static boolean isEmpty(LinkedList e)
     {
        Node n = e.head;
        if (n == null)
        {
            return n == null;
        }

        return false;

     }

     public static void showData(LinkedList list)
     {
        Node ref = list.head;
        int count = 0;

        isEmpty(list);
        
        while (ref != null)
        {
            System.out.println(ref.data + " ----> ");
            ref = ref.next;
            count++;
            if (ref == null)
            {
                System.out.println("Count: " + count);
            }
        }
     }


     public static void remove(LinkedList list)
     {
        Node current = list.head;
        Node last = null;
        Node previous = current;

        while (current != null && current.next != null)
        {
            if (current.data == current.next.data)
            {
                while (current.next != null && current.data == current.next.data)
                {
                    current = current.next;
                }
                if (previous == null)
                {
                    current = current.next;
                }
                else
                {
                    previous.next = current.next;
                }

            }

            current = current.next;
            }
        }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(99); //
        Node second = new Node(100); //
        Node third = new Node(103);
        Node fourth = new Node(84);
        Node fifth = new Node(55);
        Node sixth = new Node(67); //
        Node seventh = new Node(99); //
        Node eight = new Node(67); //
        Node ninth = new Node(100); //
        Node tenth = new Node(99); //

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;
        ninth.next = tenth;

        System.out.println("Before removal: ");
        showData(llist);

        System.out.println("After removal: ");

        remove(llist);
        
        showData(llist);

    }
}