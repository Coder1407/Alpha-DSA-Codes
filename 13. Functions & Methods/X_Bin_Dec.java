import java.util.*;
public class X_Bin_Dec {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum  = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        int binNum = sc.nextInt();
        binToDec(binNum);
    }
}