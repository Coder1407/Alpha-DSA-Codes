import java.util.*;
public class VIII_Store_Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int lastDigit, rev = 0;
        while(n>0) {
            lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println("Reversed Number: "+rev);
        sc.close();
    }
}
