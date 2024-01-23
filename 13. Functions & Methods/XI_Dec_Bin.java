import java.util.*;
public class XI_Dec_Bin {
    public static void dectoBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum > 0) {
            int rem = decNum % 2;
            binNum  = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary form of "+myNum+" = "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int decNum = sc.nextInt();
        dectoBin(decNum);
    }
}
