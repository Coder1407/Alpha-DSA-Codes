package Exercise;
import java.util.*;
public class II_EvenOdd {
    public static boolean isEven(int n) {
        if(n%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(isEven(n)) {
            System.out.println(n+" is Even");
        }
        else {
            System.out.println(n+" is Odd");
        }
    }
}
