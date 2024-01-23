import java.util.*;
public class III_ithBit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int val) {
        if(val == 0) {
            return clearIthBit(n, i);
        }
        else {
            return setIthBit(n, i);
        }
    }
    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter value of i");
        int i = sc.nextInt();
        System.out.println("Enter operation to be performed:\n1. Get ith bit\n2. Set ith bit\n3. Clear ith bit\n4. Update ith bit\n5. Clear last i bits\n6. Clear Range of bits");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
            System.out.println(getIthBit(n, i));
            break;
            case 2:
            System.out.println(setIthBit(n, i));
            break;
            case 3:
            System.out.println(clearIthBit(n, i));
            break;
            case 4:
            System.out.println("Enter new value");
            int val = sc.nextInt();
            System.out.println(updateIthBit(n, i, val));
            break;
            case 5:
            System.out.println(clearLastIBits(n, i));
            break;
            case 6:
            System.out.println("Enter value of j");
            int j = sc.nextInt();
            clearRangeBits(n, i, j);
            break;
            default:
            System.out.println("Enter valid choice");
        }
    }
}
