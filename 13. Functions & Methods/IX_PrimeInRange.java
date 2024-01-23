import java.util.*;
public class IX_PrimeInRange {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int r) {
        System.out.println("Prime nuumbers till "+r+":");
        for(int i=2; i<=r; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int r = sc.nextInt();
        primesInRange(r);
    }
}