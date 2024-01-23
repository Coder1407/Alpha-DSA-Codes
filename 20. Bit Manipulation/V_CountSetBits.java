import java.util.*;
public class V_CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n>0) {
            if((n & 1)!=0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Number of set bits in "+n+" is "+countSetBits(n));
    }
}
