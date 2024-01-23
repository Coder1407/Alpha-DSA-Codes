import java.util.*;
public class II_EvenOdd {
    public static void oddorEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) { //Finding LSB
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        oddorEven(n);
    }
}
