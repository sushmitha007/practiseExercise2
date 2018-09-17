import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("long factorials:");
        printLongFactorials();
    }

    private static void printLongFactorials() {
        long num = 1;
        long factorial = 1;
        while (true) {
            System.out.printf("The factorial of %d is %d.\n", num, factorial);
            if (Long.MAX_VALUE / factorial < (num + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (num + 1));
                break;
            }
            num++;
            factorial *= num;
        }
    }
}
