import java.util.*;


class Q1
{
    public static void scan()
    {
        System.out.println("Enter anywhere from 5-20 numbers: \n");
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<Integer>();
        //Stack stack = new Stack<>();

        int m = s.nextInt();
        int c = 1;

        while (s.hasNextInt() == true)
        {

            queue.add(s.nextInt());
            System.out.println("-" + queue.toString() + "-");
            addToStack(queue);
        }

        //addToStack(queue);

    }

    public static void addToStack(Queue q)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while (q.isEmpty() != true)
        {
            int i = (Integer)q.remove();
            stack.push(i);
            int k = stack.size();

            for (int j = 0; j < k ; j++)
                System.out.println(stack.toString());

            
        }
    }
    
    public static void main(String[] args) 
    {
        scan();
    }   
}