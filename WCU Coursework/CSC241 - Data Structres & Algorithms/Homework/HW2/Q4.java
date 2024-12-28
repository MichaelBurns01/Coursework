public class twoStacks
{
    int size;
    int top1, top2;
    int[] stack;
    twoStacks(int value) //initalizing values
    {
        size = value;
        stack = new int[size];
        top2 = size;
    }

    public void pushStack1(int n) //Push an elemnt onto Stack 1
    {
        if (top1 < top2 -1) //Checking which stack is smaller
        {
            top1++; //Increment top
            array[top1] = n; //Storing integer as top of stack
        }
        else
        {
            System.out.println("Error, stack overflow");
        }
    }

    public void pushStack2(int n) //Push an element onto the second stack
    {
        if (top1 < top2 - 1) //Checking which stack is smaller
        {
            top2--; //Decrement second stack
            arr[top2] = n; //Storing integer as top of the stack
        }
        else
        {
            System.out.println("Error, stack overflow");
        }
    }

    public int pop1() //Popping off first stack if there are values to pop off
    {
        if (top1 >= 0)
        {
            int n = arr[top1];
            top1--;
        }

        else{
            System.out.println("Error, stack overflow");
            return -1;
        }

    }

    public int pop2() //Popping off second stack
    {
        if (top2 < size)
        {
            int n = arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Error, stack overflow");
            return -1;
        }
    }


}