import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Queue q = new Queue();

        System.out.println("Enter some numbers: ");
        Scanner s = new Scanner(System.in);
        int elements = s.nextInt();
        int[] arr = new int[elements];
        for (int i = 0; i < elements; i++)
        {
            q.enqueue(s.nextInt());
        }

        s.close();
        System.out.println("elements are: ");
        q.show();
    }
}