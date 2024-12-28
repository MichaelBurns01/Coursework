public class Q4 
{
    public static int DigitSum(long num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }    

    public static long DigitSumRecusrive(long num)
    {
        long sum = 0; //Store the sum of num
        if (num == 0) //Return 0 if there are no more numbers
            return 0;

        while (num > 0)
        {
            sum = sum + (num %10); //Adding each digit to sum
            return DigitSumRecusrive(num/10); //Recursive case
        }

        return sum; //Returning sum
    }



    public static void main(String[] args) {
        System.out.println(DigitSumRecusrive(81406));
    }
}
