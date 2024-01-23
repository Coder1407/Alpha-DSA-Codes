import java.util.*;
public class III_Product {
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println(a+" * "+b+" = "+prod);
    }
}
