import java.util.Scanner;

public class factorial{
    public static void main(String[] args)
    {
        System.out.println("Int factorials:");
        printIntFactorials();
    }
    private static void printIntFactorials()
    {
        int num  = 1;
        int factorial = 1;
        while (true)
        {
            System.out.printf("The factorial of %d is %d.\n", num, factorial);
            if (Integer.MAX_VALUE / factorial < (num+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (num+1));
                break;
            }
            num++;
            factorial *= num;
        }   }
}

