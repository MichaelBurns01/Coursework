public class Q3
{
    public static int splitNum(int n)
    {
        if (n == 1)
            return n;

        else
            System.out.println(n + "->");
            return splitNum((n+1)/2) + splitNum(n/2);
    }
    
    public static void main(String[] args) {
        System.out.println(splitNum(9));

        //splitNum(10);
    }
}