//Question 1

import java.util.*;

public class Q1
{
    public static int getSumRecursive(int n)
    {   
        if (n == 0)
        {
            return 0;
        }

        return n + getSumRecursive(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(getSumRecursive(100));
    }


}