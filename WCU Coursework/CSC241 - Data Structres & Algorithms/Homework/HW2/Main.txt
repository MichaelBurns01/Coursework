import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Enter some numbers: ");
        Scanner s = new Scanner(System.in); 
        int elements = s.nextInt();
        //int[] arr = new int[elements];
        Queue q = new Queue();
        Stack stack = new Stack(elements);
        
        while(s.hasNextInt() == true)
        {
            //elements = s.nextInt();

            for (int i = 0; i < elements; i++)
            {
                q.enqueue(elements);
            }
        }

        while (!q.empty())
        {
            stack.push(q.dequeue());
        }

        while (!stack.empty())
        {
            q.enqueue(stack.pop());
        }

        while(q.empty()){
            System.out.println(q.dequeue() + " - Removed");
        }

        System.out.println("");



    }
}