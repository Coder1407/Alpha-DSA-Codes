import java.util.*;
public class II_Calculate_Sum {
    public static int CalculateSum(int num1, int num2) //formal parameters or parameters
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a,b); //actual parameters or arguments
        System.out.println("Sum is: "+sum);
    }
}
