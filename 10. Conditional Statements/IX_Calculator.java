import java.util.*;
public class IX_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator: +, -, *, /");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
    }
}
