import java.util.Scanner;
public class evenOfNum {
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }    public static void main(String[] args) {
        evenOfNum even = new evenOfNum();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        boolean result = even.isEven(num);
        System.out.println(result);
    }
}
