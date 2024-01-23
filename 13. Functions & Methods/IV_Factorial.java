import java.util.*;
public class IV_Factorial {
    public static int fact(int n) {
        int f=1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" = "+fact(n));
    }
}