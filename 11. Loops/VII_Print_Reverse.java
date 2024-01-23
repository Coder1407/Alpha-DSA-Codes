import java.util.*;
public class VII_Print_Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int lastDigit;
        System.out.println("Reversed Number: ");
        while(n>0) {
            lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        sc.close();
    }
}
