package Exercise;
import java.util.*;
public class IV_SumOfDigits {
    public static int SumDigits(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum = sum +rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Sum of Digits of "+n+" = "+SumDigits(n));
    }
}